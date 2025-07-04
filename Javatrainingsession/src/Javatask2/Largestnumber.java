package Javatask2;

import java.util.Scanner;

public class Largestnumber {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    int l=0;
    if(num1>=num2 && num1>=num3)
    {
    l=num1;
    }
    else if (num2 >= num1 && num2 >= num3)
    {
        l = num2;
    } 
    else 
    {
        l = num3;
    }
    System.out.println("The largest number is "+l);
}
}