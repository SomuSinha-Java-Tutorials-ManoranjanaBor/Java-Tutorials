/**
 * WAP to take a string as input and display the string in the following format :
 * INPUT : 	MAN IS MORTAL
 * OUTPUT:	MNA SI MRTLOA
 * (First consonants, then vowels without changing the sequence)
 * 
 * M A N   I S   M O R T  A  L
 * 0 1 2 3 4 5 6 7 8 9 10 11 12
 */

import java.io.*;
import java.lang.*;
public class ConVow 
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
			out="";
			
			char ch;
			for(int i=si;i<sp;i++)
			{
				ch=input.charAt(i);
				if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
					System.out.print(ch);
				else
					out+=ch;
			}
			System.out.print(out+" ");			
		}
	}
}
