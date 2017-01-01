package com.alueducation.cs.mfc.quadratic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Optional;

class Main {

  public static void main(String[] args) {

        System.out.println("Quadratic Equation Solver\n");
        
        System.out.println("For the quadratic equation 2x^2 + 5x - 3 = 0, enter the coefficients seperated by a space then press enter.  In this case, 2 5 -3 <enter>. To exit, press enter without specifying any coefficients.\n");

        System.out.print("Enter coefficients:\t");

        try (Scanner scanner = new Scanner(System.in))
        {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    break;
                }
                else{
                    int i = 0;
                    double[] c = new double[3];
                    
                    try(Scanner lineParser = new Scanner(line)){
                        while (lineParser.hasNextDouble() && i < 3){
                            c[i++] = lineParser.nextDouble();
                        }

                        QuadraticEquation eq = new QuadraticEquation(
                            c[0], c[1], c[2]);
                        
                        Optional<Roots> solution = eq.solve();
                        
                        if (!solution.isPresent()){
                            System.out.println("Solution is imaginary.");
                        }
                        else{
                            System.out.println(solution.get());
                        }
                    }

                    System.out.print("Enter coefficients:\t");
                }
            }
        }
    }

}