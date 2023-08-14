package javacodes.com;

import java.util.Scanner;

public class CountofNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("The count of number is = "+count);
	}
}
