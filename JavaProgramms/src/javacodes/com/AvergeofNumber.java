package javacodes.com;

import java.util.Scanner;

public class AvergeofNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n, count=1;
		float x, avg, sum=0;
		System.out.println("Enter the value of n");
		n=input.nextInt();
		while(count<=n)
		{
			System.out.println("Enter the "+count+" number");
			x=input.nextFloat();
			sum=sum+x;
			count++;
		}
		avg=sum/n;
		System.out.println("avg="+avg);
		
	}
}
