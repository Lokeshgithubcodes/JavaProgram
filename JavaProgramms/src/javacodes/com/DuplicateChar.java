package javacodes.com;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=input.nextLine();
		int count;
		char[] a=s.toCharArray();
		System.out.println("duplicate character are");
		for(int i=0;i<s.length();i++)
		{
			count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(a[i]==a[j]&&a[i]!=' ')
				{
					count++;
				}
			}
			if(count>1&&a[i]!='0') {
				System.out.print(a[i]+" ");
			}
		}
		
	}
}
