package functions;

public class AddingIntNumbers {
	int z = 50;
	
	public int addingIntTwoNumbers(int a, int b) {
		
		int m = 2700;
		String more = "more";
		int c = a + b;
		System.out.println(c);
		System.out.println(z);
		return c;
	}
	
	public int addingIntThreeNumbers(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
		System.out.println(z);
		return d;
	}
	
	public void addintNumbers(int a, int b) {
		z = 100;
		int c = a + b;
		System.out.println(c);
		System.out.println(z);
	}
	
	public String checkEqual(int a, int b) {
		
		String result= "";
		
		if(a == b) {
			result = "Equal";
		}else {
			result = "Not Equal";
		}
		System.out.println(z);
		return result;
	}
}
