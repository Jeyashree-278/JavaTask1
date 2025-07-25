package javatask4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMapprogram {

	public static void main(String[] args) {
		TreeMap<Integer,String>map=new TreeMap<>();
		map.put(300,"Jeyashree");
		map.put(100, "Iniyashree");
		map.put(200, "Aravind");
		System.out.println("Printing the id and name of all employees in sorted order based on keys:");
		for(Integer key:map.keySet())
		{
			System.out.println(key +" " + map.get(key));
		}
		List<String>names=new ArrayList(map.values());
		Collections.sort(names);
		System.out.println("After sorting employee name: ");
		for(String name:names)
		{
			System.out.println(name);
		}

	}

}
