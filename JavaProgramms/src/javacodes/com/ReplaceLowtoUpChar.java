package javacodes.com;

public class ReplaceLowtoUpChar {

	public static void main(String[] args) {
		String s = "Great power";
		StringBuffer ns=new StringBuffer(s);
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				ns.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
				ns.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println("change case = "+ns);
	}
}
