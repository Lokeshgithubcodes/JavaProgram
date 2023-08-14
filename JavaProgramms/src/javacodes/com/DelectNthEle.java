package javacodes.com;

public class DelectNthEle {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		for(int i=2;i<=a.length;i++)
		{
			a[i]=a[i+1];
		}
		int[] na=new int[a.length-1];
		for(int i=0;i<na.length;i++)
		{
			na[i]=a[i];
		}
		for(int i=0;i<na.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
