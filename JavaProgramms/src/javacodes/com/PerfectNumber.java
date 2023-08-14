package javacodes.com;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the number");
		n=input.nextInt();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
			System.out.println(n+" is not a perfect number");
	}
}
