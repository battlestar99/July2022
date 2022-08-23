package samplePackage;

import java.util.Arrays;

public class SampleClass {

	public static void main(String[] args) {
		
//		Milk horizon 1 gallon
//		
//		Milk greatValue 2 gallon
//		
//		Milk cleveland 1/2 gallon
//		
//		Milk Nestle 1/4 gallon
//		
		// int -- real numbers -- 100, 200, 52, 151, 20.25
		// double -- decimal numbers -- 10.25, 20.256, 52.35
		// String -- sentance -- name, address -- alpha numeric characters
		// boolean -- true/ false
		
		//datatype       variable         value
		int             numberOne =         10;
		
		double numberTwo = 25.75;
		
		double addition = numberOne+numberTwo; 
//		
//		int subtraction = numberTwo - numberOne;
//		
//		int multiplication = numberOne * numberTwo;
		
		double division = numberTwo / numberOne;
		
//		System.out.println(addition);
//		System.out.println(subtraction);
//		System.out.println(multiplication);
//		System.out.println(division);
		
		double numberThree = 20;
		
		String firstName = "Nazib";
		
		String lastName = "Syed";
		
		boolean isKitchenEmpty = true;
		
		//primitive data types - int, double, boolan
		//non primitive - String, Array
		
		int[] any = {};
//		any[0] = 5;
		System.out.println(Arrays.toString(any));
		String anyString = new String("Name");
//		String lastName = "Syed";
		System.out.println(anyString);
		int a = 100;
	
		if(a == 10) {
			System.out.println("a value is 10");
		}else {
			System.out.println("a value is not 10");
		}
		
		
		
		// You have to declare three variable with different expenses 
		// with some value 
		// Create another variable to store that result
		// then print your total expense
		
		int gas = 10;
		int coffee = 5;
		int lunch = 10;
		
		int expenses = gas + coffee + lunch;
		System.out.println("My daily expense: $"+ expenses);
		
		
		
		
		
		
	}

}
