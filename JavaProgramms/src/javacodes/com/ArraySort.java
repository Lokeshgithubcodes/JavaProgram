package javacodes.com;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENter the array size");
		int n=input.nextInt();
		int[] a=new int[n];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		for(j=0;j<a.length;j++)
		{
			for(i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					a[i]=a[i]+a[i+1];
					a[i+1]=a[i]-a[i+1];
					a[i]=a[i]-a[i+1];
				}
			}
			
		}
		System.out.println("array sort");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
