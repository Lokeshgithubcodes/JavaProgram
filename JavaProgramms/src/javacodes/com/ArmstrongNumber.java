package javacodes.com;

public class ArmstrongNumber {

	public static int pow(int a, int b) {
		int power=1;
		for(int i=0;i<b;i++)
		{
			power=power*a;
		}
		return power;
	}
	public static void main(String[] args) {
		int n=153,count=0,copy=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=copy;
		int ans=0;
		while(n>0)
		{
			ans=ans+pow((n%10),count);
			n=n/10;
		}
		if(copy==ans)
		{
			System.out.println("number is a Armstrong number");
		}
		else
			System.out.println("number is a not a Armstrong");
	}
}
