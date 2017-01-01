package com.alueducation.cs.mfc.quadratic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Optional;

class Main {

  public static void main(String[] args) {

        // print out how to use the application

        System.out.println("Quadratic Equation Solver\n");
        
        System.out.println("For the quadratic equation 2x^2 + 5x - 3 = 0, enter the coefficients seperated by a space then press enter.  In this case, 2 5 -3 <enter>. To exit, press enter without specifying any coefficients.\n");

        System.out.print("Enter coefficients:\t");

        // try-with-resources ensures the Scanner object closes at the end of
        // statement. This scanner reads from the standard input stream, usually
        // the keyboard
        try (Scanner scanner = new Scanner(System.in))
        {

            while(scanner.hasNextLine()){
                // read the next line of input
                String line = scanner.nextLine();

                // if the line is empty, exist the while loop
                // and consequently terminate the application.
                if (line.isEmpty()){
                    break;
                }
                else{
                    int i = 0;
                    double[] c = new double[3];
                    
                    // A second scanner that will read and tokenise 
                    // the line of input.
                    try(Scanner lineParser = new Scanner(line)){
                        // the while loop will read three doubles from the line
                        // these are the values of a, b, c from the quadratic 
                        // equation and are stored in an array.
                        while (lineParser.hasNextDouble() && i < 3){
                            c[i++] = lineParser.nextDouble();
                        }

                        // Instantiate a quadratic equation object
                        QuadraticEquation eq = new QuadraticEquation(
                            c[0], c[1], c[2]);
                        
                        // Call the solve method of the equation object to
                        // obtain the roots of the equation.
                        Optional<Roots> solution = eq.solve();
                        
                        
                        if (!solution.isPresent()){
                            // solution has no real roots
                            System.out.println("Solution is imaginary.");
                        }
                        else{
                            // print the solution
                            System.out.println(solution.get());
                        }
                    }

                    // Prompt the use for the next line of coefficients.
                    System.out.print("Enter coefficients:\t");
                }
            }
        }
    }

}