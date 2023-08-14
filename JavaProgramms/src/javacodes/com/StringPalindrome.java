package javacodes.com;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		char[] a=input.next().toCharArray();
		int i,j,count=0;
		for(i=0,j=a.length-1;i<a.length;i++,j--)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Palindrome String");
		}
		else
			System.out.println("not a palindrome");
	}
}
