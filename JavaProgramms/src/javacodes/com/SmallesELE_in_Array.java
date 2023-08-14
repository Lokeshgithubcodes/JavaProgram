package javacodes.com;

import java.util.Scanner;

public class SmallesELE_in_Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int s=input.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		int SEle=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<SEle)
			{
				SEle=a[i];
			}
		}
		System.out.println(SEle);
	}
}
