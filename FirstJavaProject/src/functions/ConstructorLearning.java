package functions;

public class ConstructorLearning {
	 static int z = 10;
	
	public ConstructorLearning(int initialValue) {
		z = initialValue;
	}
	
	
	
	public void addingIntTwoNumbers(int a, int b) {
		z = 30;
		int c = a + b + z;
		System.out.println(z);
	}
	
	
	public void addingIntThreeNumbers(int a, int b, int c) {
		int d = a + b + c + z;
		System.out.println(z);
	}
	
	public void addingIntFourNumbers(int a, int b, int c, int e) {
		int d = a + b + c + e + z;
		System.out.println(d);
	}
	
}
