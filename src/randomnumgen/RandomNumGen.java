/*
 * Dylan Moore
 * Oct 22 2019
 * creates an array of random values between 1 and 100 (size chosen by user), display it to the user and tell the user the max and min values.
 */
package randomnumgen;

import java.util.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dymoo6791
 */
public class RandomNumGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean run = true;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        while (run) {
            System.out.print("Enter the amount of values in the array\n");//prompt user
            int option = in.nextInt();
            final int[] VALUE = new int[option];
            if (option > 0) {
                for (int i = 0; i <= VALUE.length - 1; i++) {
                    int n = rand.nextInt(101);
                    VALUE[i] = n; //assigns random values in array
                    System.out.print(VALUE[i] + ", "); //display array
                }
                Arrays.sort(VALUE); //sort array
                
                System.out.println("\nThe lowest value is: " + Arrays.stream(VALUE).min().getAsInt()); //display lowest value
                System.out.println("The highest value is: " + Arrays.stream(VALUE).max().getAsInt()); //display highest value
                System.out.println(Arrays.toString(VALUE)); //display array sorted
                System.out.println("--------------------------------");
                run = true;
            } else if (option <= 0) {
                System.out.print("Invalid, Shutting down"); //shut down program if value is invalid
                run = false;
            }
        }
    }
}
