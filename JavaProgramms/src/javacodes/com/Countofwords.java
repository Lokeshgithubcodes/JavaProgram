package javacodes.com;

import java.util.Scanner;

public class Countofwords {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the words");
		String s=input.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
