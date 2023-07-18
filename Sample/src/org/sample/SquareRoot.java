package org.sample;

public class SquareRoot {
	
	
	    public static boolean isPerfectSquare(int num) {
	        int sqrt = (int) Math.sqrt(num);
	        return sqrt * sqrt == num;
	    }

	    public static void main(String[] args) {
	        int number = 30; // Input number

	        if (isPerfectSquare(number)) {
	            System.out.println("The square root of " + number + " is an integer.");
	        } else {
	            System.out.println("The square root of " + number + " is not an integer.");
	        }
	    }
	}

