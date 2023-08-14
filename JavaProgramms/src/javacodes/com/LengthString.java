package javacodes.com;

import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		char[] a=input.next().toCharArray();
		int count=0;
		for(int i:a)
		{
			count++;
		}
		System.out.println(count);
	}
}
