package javacodes.com;

public class SumofINTArray {

	public static void main(String[] args) {
		int[] a= {2,5,3,6,7,8,5,4,6,3};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
