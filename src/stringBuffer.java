
public class stringBuffer 
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("Computer Fun");
		StringBuffer p = new StringBuffer("Is");
		s.insert(8, p);
		System.out.println(s);
	}
}
