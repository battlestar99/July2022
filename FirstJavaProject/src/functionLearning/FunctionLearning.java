package functionLearning;

import functions.AddingDoubleNumber;

public class FunctionLearning {

	public static void main(String[] args) {
		FunctionLearning fl = new FunctionLearning();
		fl.addingIntWithString(40, "Any");
		fl.addingIntNumbers(10, 20);
		fl.addingIntNumbers(100, 300);
		fl.addingNames("First Name ", "Middle Name ", "Last Name");
		
		AddingIntNumbers ain = new AddingIntNumbers();
		ain.addingIntThreeNumbers(10, 20, 30);
		ain.addingIntTwoNumbers(2, 5);
		
		AddingDoubleNumber adn = new AddingDoubleNumber();
		adn.addTwoDoubleNumbers(10.25, 205.02);
		
	}
	
	public void addingIntNumbers(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	// hundreds of adding int numbers functions
	
	public void addingIntWithString(int a, String b) {
		String c = a +" " + b;
		System.out.println(c);
	}
	
	public void addingNames(String firstName, String middleName, String lastName) {
		String fullName = firstName + middleName + lastName;
		System.out.println(fullName);
	}
	
	// functions for string
	
//	 create a function for adding two decimal point numbers
//	 create a function for adding your first, middle, last name
//	 create a function for printing int number with a string
//	 create a function for adding three real numbers
//	 create a function for subtract two int numbers
//	 create a function for multiply two numbers
//	 create a function for divide two numbers
//	 create a function to print 1 to 100 (every ten together)
	
}







// break till 8:55











