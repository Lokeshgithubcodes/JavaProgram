package javacodes.com;

import java.util.Scanner;

public class Validtriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENter the 1st angle");
		int a=input.nextInt();
		System.out.println("Enter the 2nd angle");
		int b=input.nextInt();
		System.out.println("Enter the 3rd angle");
		int c=input.nextInt();
		int tot=a+b+c;
		if(tot==180)
		{
			System.out.println("triangle is valid");
		}
		else
			System.out.println("triangle is not valid");
				
	}
}
