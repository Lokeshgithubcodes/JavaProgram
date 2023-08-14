package javacodes.com;

import java.util.Scanner;

public class FirstNONrepeatingChar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string");
		String s=input.nextLine();
		for(Character ch:s.toCharArray())
		{
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println("The 1st non repeating char "+ch);
				break;
			}
		}
	}
}
