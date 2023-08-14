package javacodes.com;

import java.util.Scanner;

public class Greatestof3Numbers {
 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENter the 1st number");
		int n1=input.nextInt();
		System.out.println("Enter the 2nd number");
		int n2=input.nextInt();
		System.out.println("Enter the 3rd number");
		int n3=input.nextInt();
		if(n1>n2&&n1>n3)
		{
			System.out.println("n1 is bigger");
		}
		else if(n2>n3)
		{
			System.out.println("n2 is bigger");
		}
		else
			System.out.println("n3 is bigger");
	}
}
