package javacodes.com;

public class NumberPalindrome {

	public static void main(String[] args) {
		int n=121, rev=0, copy=n;
		while(n>0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		if(rev==copy)
		{
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("number is not palindrome");
	}
}
