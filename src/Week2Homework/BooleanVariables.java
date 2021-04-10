package Week2Homework;

public class BooleanVariables {
	public static void main(String[] args) {
		//Demonstrate use of Boolean variables
		//declare variables
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		double costOfMilk = 3.99;
		double moneyInWallet = 53.00;
		int thirstLevel = 7;
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk);
		
		//output variables
		System.out.println("Hot Outside?  " + isHotOutside);
		System.out.println("Weekday?  " + isWeekday);
		System.out.println("Have any money?  " + hasMoneyInPocket);
		System.out.println("Cost of milk is $" + costOfMilk);
		System.out.println("Money in wallet = " + moneyInWallet);
		System.out.println("Thirst level from 1 to 10 is " + thirstLevel);
		
		System.out.println("Should I buy ice cream?  " + shouldBuyIceCream);
		System.out.println("Should I go swimming?  " + willGoSwimming);
		System.out.println("Is it a good day?  " + isAGoodDay);
		System.out.println("Should I buy milk?  " + willBuyMilk);
		
	}

}
