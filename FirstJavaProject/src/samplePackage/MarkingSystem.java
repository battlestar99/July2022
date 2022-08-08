package samplePackage;

public class MarkingSystem {

	public static void main(String[] args) {
		
//		 90 - A
//		 80 - B
//		 70 - C
//		 60 - D
//		 50 - E
//		 <50- F
		
		int mark = 99; // -10 or 101 - Invalid input
				//true				||			// false
		if(mark >= 90 && mark <= 100) { //  || - or  && - and
			System.out.println("A");
		}else if(mark >= 80 && mark <= 89) {
			System.out.println("B");
		}else if(mark >= 70  && mark <= 79) {
			System.out.println("C");
		}else if(mark >= 60  && mark <= 69) {
			System.out.println("D");
		}else if(mark >= 50 && mark <= 59) {
			System.out.println("E");
		}else if(mark >= 0 && mark <= 49) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
