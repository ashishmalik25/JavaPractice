package org.sample;

public class CountOnes {
	
       public static void main(String[] args) {
          int count = 0;

          for (int i = 0; i <= 100; i++) {
             int num = i;

             // Iterate over each digit in the number
             while (num > 0) {
                int digit = num % 10; // Extract the rightmost digit

                if (digit == 1) {
                   count++;
                }

                num = num / 10; // Remove the rightmost digit
             }
          }

          System.out.println("The digit 1 occurs " + count + " times from 0 to 100.");
       }
    }