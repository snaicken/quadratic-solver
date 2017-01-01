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
     */
    public Roots(double q){
        this.q = q;
        this.s = q;
    }

    /**
     * Creates a representation of the roots of a quadratic equation.
     */
    public Roots(double q, double s) {
        this.q = q;
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Roots))
            return false;

        Roots r = (Roots) obj;
        return (this.q == r.q && this.s == r.s) || 
            (this.q == r.s && this.s == r.q);
    }

    @Override
    public String toString() {
        return q == s ? "x = " + q : "(" + q + ", " + s + ")";
    }
}