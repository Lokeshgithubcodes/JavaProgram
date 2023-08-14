package javacodes.com;

import java.util.Scanner;

public class MostFreqEle_in_Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enetr the array size");
		int s=input.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		int mostfreq=a[0];
		int maxcount=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				mostfreq=a[i];
			}
		}
		System.out.println(mostfreq);
	}
}
