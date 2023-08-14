package javacodes.com;

public class ThridLargestELEinArray {

	public static int getthird(int[] a,int tot)
	{
		int temp;
		for(int i=0;i<tot;i++)
		{
			for(int j=i+1;j<tot;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[tot-3];
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {23,34,23,45,67,34,6};
		System.out.println("third largest element= "+getthird(a, 7));
		System.out.println("third largest elements= "+getthird(b, 7));
	}
}
