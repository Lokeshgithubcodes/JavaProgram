package javacodes.com;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int s=input.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					a[i]=a[i]+a[i+1];
					a[i+1]=a[i]-a[i+1];
					a[i]=a[i]-a[i+1];
				}
			}
		}
		System.out.println("after sorted");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
