package javacodes.com;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		int sum=0,dig;
		while(n>0)
		{
			dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		System.out.println("The sum of digit is = "+sum);
	}
}
