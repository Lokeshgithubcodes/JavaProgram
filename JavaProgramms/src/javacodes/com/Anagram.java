package javacodes.com;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1=input.nextLine();
		System.out.println("Enter the string 2");
		String s2=input.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("Both not a anagram");
		}
		else
		{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("Both the strings are anagram");
			}
			else
				System.out.println("Both the string are not anagram");
		}
	}
}
