package functions;

public class MainFunction {

	public static void main(String[] args) {
		
		AddingIntNumbers ain = new AddingIntNumbers();
		int result1 = ain.addingIntTwoNumbers(10, 20);
		int result2 = ain.addingIntThreeNumbers(41, 20, 85);
		
		int mainResult = result1 + result2;
		System.out.println(mainResult);
		
		ain.addintNumbers(50, 50);
		String r = ain.checkEqual(10, 20);
		System.out.println(r);
	}

}
