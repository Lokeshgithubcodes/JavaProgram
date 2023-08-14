package javacodes.com;

import java.util.Scanner;

public class RevomeDuplicatesINArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=input.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[index++]=a[i];
			}
		}
		int [] result=new int[index];
		for(int i=0;i<index;i++)
		{
			result[i]=a[i];
		}
		System.out.println("array after  removing duplicate: ");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
	}
}
