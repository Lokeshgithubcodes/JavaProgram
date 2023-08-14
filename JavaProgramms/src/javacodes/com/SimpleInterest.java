package javacodes.com;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float p,r,t,si;
		System.out.println("Enter the principle");
		p=input.nextFloat();
		System.out.println("Enter the rate of interest");
		r=input.nextFloat();
		System.out.println("Enter the time");
		t=input.nextFloat();
		si=(p*r*t)/100;
		System.out.println("Simpleinterest is "+si);
		
	}
}
