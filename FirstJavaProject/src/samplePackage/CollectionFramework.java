package samplePackage;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionFramework {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		names[0] = "myName";
		names[1] = "myName2";
		names[2] = "myName3";
		System.out.println(Arrays.toString(names));
		
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("yourName");
		namesList.add("yourName2");
		namesList.add("yourName3");
		namesList.add(3, "yourName4");
		System.out.println(namesList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
