package javacodes.com;

import java.util.Scanner;

public class MaxMinCharOccurance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=input.nextLine();
		int[] freq=new int[s.length()];
		char minchar=s.charAt(0),maxchar=s.charAt(0);
		int i,j,min,max;
		char String[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<s.length();j++) {
				if(String[i]==String[j]&&String[i]!=' '&&String[i]!='0')
				{
					freq[i]++;
					String[j]='0';
				}
			}
		}
		min=max=freq[0];
		for(i=0;i<freq.length;i++)
		{
			if(min>freq[i]&&freq[i]!='0')
			{
				min=freq[i];
				minchar=String[i];
			}
			if(max<freq[i])
			{
				max=freq[i];
				maxchar=String[i];
			}
		}
		System.out.println("minimun occarance = "+minchar);
		System.out.println("maximum occarance = "+maxchar);
	}
}
