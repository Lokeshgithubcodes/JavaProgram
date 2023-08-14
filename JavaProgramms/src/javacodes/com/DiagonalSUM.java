package javacodes.com;

import java.util.Scanner;

public class DiagonalSUM {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=input.nextInt();
		System.out.println("Enter the number of col");
		int c=input.nextInt();
		int[][] a=new int[r][c];
		int i,j,sum=0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=input.nextInt();
			}
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.println(a[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("sum of diagonal "+sum);
	}
}
