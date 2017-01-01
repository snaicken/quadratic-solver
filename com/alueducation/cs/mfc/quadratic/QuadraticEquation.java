package com.alueducation.cs.mfc.quadratic;

import java.util.Optional;

/**
 * Implementation of the quadratic equation.
 */
public class QuadraticEquation {

    /** The quadratic coefficient */
    private double a;

    /** The linear coefficient */
    private double b;

    /** The constant term */
    private double c;

    /**
     * Constructs a new quadratic equation.
     * 
     * @param a the quadratic coefficient.
     * @param b the linear coefficient.
     * @param c the constant term.
     */
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Solve the quadratic equation.
     *
     * @return Optional object that will be empty if there are no real roots,
     *         or contains a Roots object that contains the real roots.
     */
    public Optional<Roots> solve(){

        // TODO: implement the descriminant
        double descriminant = 0;

        if(descriminant < 0){
            // The roots are imaginary, and we are only interested in real
            // roots. So, we return a null value.
            return Optional.empty();
        }
        else if (descriminant == 0){
            // TODO: Implement the code to give q, a root.
            double q = 0;

            return Optional.of(new Roots(q));
        }
        else {
            // TODO: Implement the code to give q and s, the roots of the
            // equation.
            double q = 0;
            double s = 0;

            return Optional.of(new Roots(q, s));
        }
    }
     
}