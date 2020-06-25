import java.util.Scanner;

public class ConvertNumToString {

	public static String convertToString(int num) {

		if (num < 0) {
			return "Invalid number";
		}
		String word = "";

		String unitArray[] = { " Zero", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine",
				" Ten" };

		String tensArray[] = { " Zero", " Ten", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy",
				" Eighty", " Ninty" };

		if (num == 0) {
			return "Zero";
		}
		
		if ((num / 1000000) > 0) {
			word += convertToString(num / 1000000) + " Million";
			num %= 1000000;
		}

		if ((num / 1000) > 0) {
			word += convertToString(num / 1000) + " Thousand";
			num %= 1000;
		}

		if ((num / 100) > 0) {
			word += convertToString(num / 100) + " Hundread";
			num %= 100;
		}

		if ((num / 10) > 0) {
			word += tensArray[num / 10];
			num %= 10;
		}

		if (num < 10) {
			word += unitArray[num];
		}
		return word;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		int dollars = (int) num;
//		System.out.println("Before: " + dollars);
		int cents = (int) ((num - dollars) * 100);
//		System.out.println("After: " + cents);

		
		String numToWord = "";
		 
		if(dollars > 0) { 
			numToWord += convertToString((int) dollars) + ((dollars > 1) ? " Dollars" : " Dollar"); 
		} 
		
		if (cents > 0) { 
			if (dollars > 0) numToWord += " and"; 
			numToWord += convertToString((int) cents) + ((cents > 1) ? " Cents" : " Cent"); 
		}
		 

		System.out.println(numToWord);
		
	}
}
