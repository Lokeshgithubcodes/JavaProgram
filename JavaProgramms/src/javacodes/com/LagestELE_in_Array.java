package javacodes.com;

import java.util.Scanner;

public class LagestELE_in_Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int s=input.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		int lEle=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>lEle)
			{
				lEle=a[i];
			}
		}
		System.out.println(lEle);
	}
}
