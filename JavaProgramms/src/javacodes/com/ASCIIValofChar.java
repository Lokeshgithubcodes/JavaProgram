package javacodes.com;

import java.util.Scanner;

public class ASCIIValofChar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=input.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			System.out.println("ACSII value of "+ch+" is = "+(int)ch);
		}
	}
}
