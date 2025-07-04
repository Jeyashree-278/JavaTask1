package Javatask2;

import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Marks");
	    
	        int mark = sc.nextInt();
	        
	        if (mark > 100) {
	            System.out.println("Invalid Input");
	        } 
	        else if (mark == 100) 
	        {
	            System.out.println("S");
	        } 
	        else if (mark >= 90) 
	        {
	            System.out.println("A");
	        } 
	        else if (mark >= 80) 
	        {
	            System.out.println("B");
	        } 
	        else if (mark >= 70) 
	        {
	            System.out.println("C");
	        } 
	        else if (mark >= 60) 
	        {
	            System.out.println("D");
	        } 
	        else if (mark >= 50) {
	            System.out.println("E");
	        } 
	        else {
	            System.out.println("F");
	        }
	        
	    
	    }
	
		// TODO Auto-generated method stub

	}


