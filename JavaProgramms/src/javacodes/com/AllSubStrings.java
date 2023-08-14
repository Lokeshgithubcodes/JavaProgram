package javacodes.com;

import java.util.Scanner;

public class AllSubStrings {

	public static void printsub(String s)
	{
		System.out.println("all the possible substring");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=input.nextLine();
		printsub(s);
	}
}
