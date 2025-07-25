package javatask4;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayProgram {

	public static void main(String[] args) {
		List<String>l=new ArrayList();
		l.add("Jeyashree");
		l.add("Iniyashree");
		l.add("Aravind");
		String[]sarray=l.toArray(new String[0]);
		System.out.println("The elements in the array are:");
		for(String s:sarray)
		{
			System.out.println(s);
		}
	}

}
