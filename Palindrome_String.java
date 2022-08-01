package learning;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		System.out.println("the given string is " + str);
		String str1 = "";    
		int n = str.length();
		int count = 0;
		for (int i = n - 1; i < n && i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == str1.charAt(i)) {
				count++;
			}
		}
		if (count == n)
			System.out.println("palindrome");

		else
			System.out.println("not a palindrome");
		

	}
}