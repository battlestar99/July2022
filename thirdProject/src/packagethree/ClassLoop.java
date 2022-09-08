package packagethree;

import java.util.Scanner;

public class ClassLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner (System.in); 
		System.out.println ("Enyter Value"); 
		int x = sc.nextInt();  
		int sum= 0;
		for (int i=1;i<=x;i++) { //1+1 
			sum=sum+i;//
		    System.out.println (i);
		
	} 
		System.out.println (sum);
		
	} 
	
}



