package javacodes.com;

public class DuplicateCountArray {

	public static void main(String[] args) {
		int []a= {1,2,3,2,3,4,5,6,7,5,3,4};
		System.out.println("the duplicate elements in a given array are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
				}
			}
		}
	}
}
