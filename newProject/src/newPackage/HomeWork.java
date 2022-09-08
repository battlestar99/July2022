package newPackage;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan = new Scanner(System.in); // Scanner class is used to read input from keyboard in Java. 
        // created scanner object

        System.out.print("Enter any String: ");
        String str = scan.nextLine(); // nextLine() method we use to Read user input/strings

        System.out.println("\nYou've entered: " +str); // output of user input
 
	}

}
