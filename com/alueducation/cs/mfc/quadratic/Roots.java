package com.alueducation.cs.mfc.quadratic;

/**
 * Representation of the roots of a quadratic equation.
 */
public class Roots {

    /** A root of a quadratic equation */
    double q;

    /** A root of a quadratic equation */
    double s;

    /**
     * Creates a representation of the roots of a quadratic equation where 
     * there is only a single root.
     *
     * @param   q the root value.
     */
    public Roots(double q){
        this.q = q;
        this.s = q;
    }

    /**
     * Creates a representation of the roots of a quadratic equation.
     *
     * @param   q a root value.
     * @param   s a root value.
     */
    public Roots(double q, double s) {
        this.q = q;
        this.s = s;
    }

    /**
     * Determines if a given roots object, obj, is equal to this object.
     * 
     * @param   obj the object with which to compare.
     * @return  true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // if obj is null or not a Roots object, then equality is false.
        if (obj == null || !(obj instanceof Roots))
            return false;

        // obj is equal to this object if both objects contain the same values
        // regardless of variable assigned to.
        Roots r = (Roots) obj;
        return (this.q == r.q && this.s == r.s) || 
            (this.q == r.s && this.s == r.q);
    }

    /**
     * Returns a string representation of the roots object.
     *
     * The string is in the form "x = q" for a single root solution
     * or "(q, s)" where q and s are roots.
     *
     * @return a string representation of the roots of a quadratic equation.
     */
    @Override
    public String toString() {
        return q == s ? "x = " + q : "(" + q + ", " + s + ")";
    }
}