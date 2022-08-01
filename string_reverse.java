package learning;

import java.util.*;

public class string_reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("the given string is " + str);
		String str1 = "";
		int n = str.length();
		for (int i = n - 1; i < n && i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		System.out.println("the reversed string is "+str1);
	}
}
