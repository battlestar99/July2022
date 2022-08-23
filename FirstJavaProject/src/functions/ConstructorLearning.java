package functions;

public class ConstructorLearning {
	int z;
	
	public ConstructorLearning(int y) {
		z = y;
	}
	
	
	public void addingIntTwoNumbers(int a, int b) {
		int c = a + b + z;
		System.out.println(c);
	}
	
	public void addingIntThreeNumbers(int a, int b, int c) {
		int d = a + b + c + z;
		System.out.println(d);
	}
	
	public void addingIntFourNumbers(int a, int b, int c, int e) {
		int d = a + b + c + e + z;
		System.out.println(d);
	}
	
}
