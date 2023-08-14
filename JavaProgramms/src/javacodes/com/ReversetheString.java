package javacodes.com;

import java.util.Scanner;

public class ReversetheString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sentences");
		String s=input.nextLine();
		char[] temp=s.toCharArray();
		int l,r=0;
		r=temp.length-1;
		for(l=0;l<r;l++,r--)
		{
			char ch=temp[l];
			temp[l]=temp[r];
			temp[r]=ch;
		}
		for(char a:temp)
		{
			System.out.print(a);
			
		}
	}
}
