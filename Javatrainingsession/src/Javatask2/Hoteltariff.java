package Javatask2;

import java.util.Scanner;

public class Hoteltariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Month of booking");
	    
	        int month = sc.nextInt();
	        
	        System.out.println("Enter rent");
		    
	        int rent = sc.nextInt();
 System.out.println("Enter number of days");
 double total=0;
		    
	        int days = sc.nextInt();
	        switch(month) {
	        case 1:case 2:case 3:case 7:case 8: case 9:case 10:
	        	
	        total=rent*days;
	        
	        break;
	        case 4:case 5:case 6:case 11:case 12: 
	        	total=rent*days*1.2;
	        	break;
	        default:
                System.out.println("Invalid month");
	        
	        }
	        String result = String.format("%.2f", total);
	        System.out.println(result);

	}

}
