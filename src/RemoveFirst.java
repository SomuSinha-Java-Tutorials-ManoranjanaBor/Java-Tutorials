/**
 * WAP to take a string as input and display the string in the following format :
 * INPUT : 	MAN IS MORTAL
 * OUTPUT:	AN S ORTAL
 * Removing the first letter of each word.
 */

import java.io.*;
import java.lang.*;
public class RemoveFirst 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Statement : ");
		String input = in.readLine();
		String out="";
		
		int sp=-1;
		while(sp!=input.length())
		{
			int si=sp+1;
			sp = input.indexOf(' ', si);
			if(sp==-1)
				sp=input.length();
			
			System.out.print(input.substring(si+1, sp));
			System.out.print(" ");
	
		}
	}
}
