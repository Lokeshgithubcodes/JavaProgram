package javacodes.com;

public class InsertsubSTRtomainSTR {

	public static void main(String[] args) {
		String s1="Java Stack";
		String s2="Full ";
		int index=4;
		String r=" ";
		for(int i=0;i<s1.length();i++)
		{
			r=r+s1.charAt(i);
			if(i==index)
			{
				r=r+s2;
			}
		}
		System.out.println(r);
	}
}
