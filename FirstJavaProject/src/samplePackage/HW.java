package samplePackage;

public class HW {

	public static void main(String[] args) {
		
		HWHelpingClass hwhc = new HWHelpingClass();
		
		double basePrice;

		double downPayment;

		double adminFee;

		double tax;
		int creditScore = 600;
		double apr = 0.5;
		int months;
		double finalFinanceAmount;

		basePrice = 30000;
		downPayment = 5000;
		adminFee = 1000;
		tax=7;
		
		// 800 -- 1%
		// 750-799 -- 1.5%
		// 700 - 749 -- 2%
		
		if(creditScore >= 800) {
			apr = 0.01; //1% -- 1/100;
		}else if(creditScore <= 799 && creditScore >= 750) {
			apr = 0.015;
		}else if(creditScore <= 749 && creditScore >= 700) {
			apr = 0.02;
		}
		
		double finalPriceWithouttax = hwhc.finalPriceWithouttax(basePrice, adminFee);
		System.out.println(finalPriceWithouttax);
		
		double totalTaxrequired= finalPriceWithouttax*(tax/100);
		System.out.println(totalTaxrequired);

		double finalprice=finalPriceWithouttax+totalTaxrequired;
		System.out.println(finalprice);

		double FinanceAmount= finalprice- downPayment;
		System.out.println(FinanceAmount);
		
		double aprOnFinancePrice = FinanceAmount * apr;
		System.out.println(aprOnFinancePrice);
		
		double priceAfterAddingApr = FinanceAmount + aprOnFinancePrice;
		System.out.println(priceAfterAddingApr);

		months = 60;
		double monthlyPayment= priceAfterAddingApr/months;
		System.out.println(monthlyPayment);
	}

}
