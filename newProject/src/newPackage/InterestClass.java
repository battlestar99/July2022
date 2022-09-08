package newPackage;

import java.util.Scanner;

public class InterestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		float p,r,t,sinterest; 
		Scanner sc = new Scanner (System.in); //sc object of Scanner class
		System.out.println ("Enter the principal Value"); 
		p = sc.nextFloat();  //next token of input as float 
		System.out.println ("Enter the rate of interest"); 
		r = sc.nextFloat(); 
		System.out.println ("Enter the Period of Time"); 
		t = sc.nextFloat();  
	 
		sinterest = (p*r*t)/100;  
		System.out.println ("Simple Interest: " +sinterest);
		
			
		
		
	}

}
