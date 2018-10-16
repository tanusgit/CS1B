package palindrome;

public class Palindone
{
	public static void main(String args[])
	{
		boolean s = PalindroneFunction("MOOOMA");
		System.out.println(s);
	}
	


public static boolean PalindroneFunction( String s)
	{
	String result = "";
	String string = s;
	char firstletter = s.charAt(0);
	char mid = s.charAt(1);
	char lastletter = string.charAt(string.length() - 1);
	char secondletter = string.charAt(string.length() - 2);
	int length = s.length();
	for (int i = 0; i < length; i++)
	{
		if (firstletter == lastletter && secondletter == mid)
		{
			return true;		
		}
		return false;
	}
	
	return true;
	}
}