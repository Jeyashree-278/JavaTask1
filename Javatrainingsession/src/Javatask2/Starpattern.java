package Javatask2;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an odd number: ");
	        int n = sc.nextInt();
	        if (n % 2 == 0) {
	            System.out.println("Please enter an odd number for symmetric pattern");
	        }

	        for (int i = 1; i <= n; i++) {             // Loop over rows
	            for (int j = 1; j <= n; j++) {         // Loop over columns
	                if (j == i || j == n - i + 1) {    // Diagonal positions
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();                  
	        }
	    }
	
	}


