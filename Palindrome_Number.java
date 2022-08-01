package learning;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Orginal=n;
		int sum = 0;
		int temp = 0;
		
		while (n > 0) {
			temp = n % 10;
			sum = sum * 10 + temp;
			n = n / 10;
		}
		
		int reverse = sum;
		if(Orginal==reverse)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
