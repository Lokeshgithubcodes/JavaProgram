package javacodes.com;

public class EvenandOdd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Even numbers");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd number");
		for(int i=1;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
