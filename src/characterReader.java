import java.io.*;
public class characterReader 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char p;
		System.out.print("Enter a Character : ");
		p=(char)in.read();
		System.out.println("Character = "+p);
		
		p=(char)in.read();
		System.out.println("Character = "+p);
		
		p=(char)in.read();
		System.out.println("Character = "+p);
		
		p=(char)in.read();
		System.out.println("Character = "+p);
	}
}
