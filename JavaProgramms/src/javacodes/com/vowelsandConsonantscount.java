package javacodes.com;

public class vowelsandConsonantscount {

	public static void main(String[] args) {
		int Vcount=0, Ccount=0;
		String s="this is simple sentences";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||
					s.charAt(i)=='e'||
					s.charAt(i)=='i'||
					s.charAt(i)=='o'||
					s.charAt(i)=='u') {
				Vcount++;
			}
			else if(s.charAt(i)>'a'&&s.charAt(i)<='z')
				{
					Ccount++;
				}
			
			System.out.println(Vcount);
			System.out.println(Ccount);
		}
	}
}
