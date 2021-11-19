/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testarrays;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class MaxValueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the list size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the value of item " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int max = maxValue(numbers);

        System.out.println("The max value is: " + max);

    }

    public static int maxValue(int[] numbers) {

        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}
