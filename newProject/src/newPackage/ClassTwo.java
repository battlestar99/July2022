package newPackage;

import java.util.Scanner; //importing libraries

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner abc = new Scanner (System.in); 
		System.out.println("AGE :"); //line1 
		String str = abc.nextLine();
		 
		
		Scanner scan1 = new Scanner (System.in);  
		System.out.println("Name :"); 
		String str2 = scan1.nextLine();//output
		 //line2
		System.out.println("My age" +str);  
		System.out.println("My name" +str2);
		
		
		
	}

}
