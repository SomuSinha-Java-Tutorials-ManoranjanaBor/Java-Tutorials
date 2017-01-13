import java.io.*;
public class wordSearch 
{
	public static void main(String args[])
	{
		String text="A Textbook of Ants";
		String searchWord = "Of";
		int count = 0;
		
		int sp = 0; // Starting Point
		int ls = 0;	// Last space Location
		for(int i=0;i<text.length();i++)
		{
			String word="";
			if(text.charAt(i)==' ')
			{
				ls = i;
				word = text.substring(sp, ls);
				sp = ls + 1;
			}
			else if(i==text.length()-1)
			{
				ls = i+1;
				word = text.substring(sp, ls);
			}
			else
				continue;
			
			if(word.equalsIgnoreCase(searchWord))
			{
				count++;
			}
		}
		System.out.println("Number of times the word was found = "+count);
	}
}
