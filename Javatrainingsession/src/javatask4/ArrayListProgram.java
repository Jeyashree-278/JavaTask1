package javatask4;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Jeyashree");
		al.add("Iniyashree");
		al.add("Aravind");
		System.out.println("Initial values in the list:");
		for(String s:al)
		{
			System.out.println(s);
		}
		al.removeAll(al);
		System.out.println("After removing all the elements in the list:");
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
