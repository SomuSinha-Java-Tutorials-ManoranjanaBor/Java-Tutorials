import java.io.*;
public class reverseString 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter a Statement : ");
		String st = in.readLine();
		int i,first_char,last_char,p;
		first_char=last_char=0;
		char ch;
		p=st.length();
		for(i=0;i<p;i++)
		{
			ch=st.charAt(i);
			if(ch==' ')
			{
				last_char=i-1;
				System.out.print(reverse(st,first_char, last_char)+" ");
				first_char=last_char=i+1;
				
			}
		}
		last_char=i-1;
		System.out.print(reverse(st,first_char, last_char)+" ");
	}
	
	public static String reverse(String st, int start, int end)
	{
		String output="";
		for(int i=end;i>=start;i--)
			output+=Character.toString(st.charAt(i));
		return output;
	}
}
