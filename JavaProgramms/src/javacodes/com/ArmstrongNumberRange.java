package javacodes.com;

import java.util.Scanner;

public class ArmstrongNumberRange {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=input.nextInt();
		System.out.println("Enter the second number");
		int n2=input.nextInt();
		for(int i=n1;i<n2;i++)
		{
			int check,rem,sum=0;
			check=i;
			while(check!=0)
			{
				rem=check%10;
				sum=sum+(rem*rem*rem);
				check=check/10;
			}
			if(sum==i)
			{
				System.out.println(i+" is a Armstrong number");
			}
			
		}

	}
}
