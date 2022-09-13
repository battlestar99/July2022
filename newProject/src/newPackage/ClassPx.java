package newPackage;

public class ClassPx {
    static int plusMethod (int x , int y ) {  
    	  
    	return x * y; //addition
    }
    static double plusMethod (double x , double y ) {  
  	  
    	return x + y; //addition
    }
	
	
	public static void main(String[] args) { //run
		
		int myNum = plusMethod (8,5);    
		double myNum2 = plusMethod(4.3,6.26);  
		System.out.println ("int :  " +myNum);
		System.out.println ("double :  " +myNum2);
		
		
		
	}

}
