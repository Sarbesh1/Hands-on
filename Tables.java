package learning;

import java.util.Scanner;

public class learn {
    
	public static void main(String[] args) {
         int n=0,sum=0;
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
		 for(int i=1; i <= 10 ; i++) {
			 sum = i *n;
			 System.out.println(n + " x " + i + " = " + sum);
			 
		 }
	}

}
