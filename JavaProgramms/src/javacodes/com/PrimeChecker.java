package javacodes.com;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("not prime");
		}
		else
			System.out.println("prime");
	}
}
