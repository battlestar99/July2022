package samplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class CollectionFramework {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		names[0] = "myName";
		names[1] = "myName2";
		names[2] = "myName3";
		System.out.println(Arrays.toString(names));
		System.out.println(names[1]);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(30);
		
		double anyDouble = 10.25;

		System.out.println(numbers.size());
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		Set<Integer> anySet = new TreeSet<Integer>();//Double
		anySet.add(20);
		anySet.add(50);
		anySet.add(30);
		
		System.out.println(anySet);
		
		
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(1234, "Mehdi");
		students.put(1235, "Zakir");
		
		System.out.println(students.get(1234));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a = 20;
//		int b = 30;
//		
//		int diff = a - b;
//		System.out.println(diff);
//		
//		if(a>b) {
//			System.out.println("a is max: "+a +" "+ "b is min: "+b);
//		}else if(a<b) {
//			System.out.println("b is max: "+b +" "+ "a is min: "+a);
//		}else {
//			System.out.println("Both are equal");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
