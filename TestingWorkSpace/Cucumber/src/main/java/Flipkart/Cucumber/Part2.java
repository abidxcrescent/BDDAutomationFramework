package Flipkart.Cucumber;

import java.util.Scanner;

public class Part2 {
	
	
	
	public static void main(String[] args) {
		System.out.println("Part 2");
		
		final int buyTransactionFee = 15;
		final int sellTransactionFee = 10;
		final String stockSymbol = "$";
		
		
		if(stockSymbol.isEmpty()) {
			System.out.println("Please set value for currency");
		}
		if(stockSymbol.matches("^\\d+(\\.\\d+)?")) {
			System.out.println("Please enter a string value");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		
//		int flag = 0;
//		while(true) {
//			System.out.println("What's your name?");
//			String yourName1 = sc.next();
//			if(yourName1.trim().isEmpty()) {
//				System.out.println("Please set value for your name");
//				flag = 1;
//				continue;
//			}
//			if(yourName1.matches("^\\d+(\\.\\d+)?")) {
//				System.out.println("Please enter a string value");
//				flag = 2;
//				continue;
//			}
//			break;
//			
//		}
		
//		if (flag==1 || flag==2) {
//			System.out.println("What's your name?");
//			String yourName1 = sc.next();
//		}


		System.out.println("What stock are you purchasing?");
		String stockName = sc.next();
		
		System.out.println("How many shares bought?");
		int numberShares = sc.nextInt();
		
		
		System.out.println("Buy price?");
		double buyPrice = sc.nextDouble();
		
		System.out.println("Sale price?");
		double sellPrice = sc.nextDouble();
		
		double totalFee = (buyTransactionFee+sellTransactionFee);
	
		
		System.out.println("Stateme of "+stockName+" Transaction for "+yourName);
		
		System.out.println("Number of shares purchased (max 1000):    "+numberShares);
		
		System.out.println("Amount of purchase:                      "+stockSymbol+String.format("%.2f",numberShares*buyPrice));
		
		System.out.println("Amount of sale:                          "+stockSymbol+String.format("%.2f",numberShares*sellPrice));
		
		System.out.println("Transaction fee paid:                    "+stockSymbol+String.format("%.2f",totalFee));
		
		System.out.println("Net profit:                              "+stockSymbol+String.format("%.2f",(numberShares*sellPrice-numberShares*buyPrice-(buyTransactionFee+sellTransactionFee))));
		
		
		
		
	}
	
	
	private static String checkString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String yourName11 = sc.next();
		
		int flag = 0;
		while(true) {

			if(yourName11.trim().isEmpty()) {
				System.out.println("Please set value for your name");
				flag = 1;
				continue;
			}
			if(yourName11.matches("^\\d+(\\.\\d+)?")) {
				System.out.println("Please enter a string value");
				flag = 2;
				continue;
			}
			break;
			
		}
		if()
		return yourName11;
	}

}
