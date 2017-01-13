import java.io.*;
public class nameShortener 
{
	public static void main(String args[]) throws IOException
	{
		String orgStr, newStr = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter the Name : ");
		orgStr = in.readLine();
		
		newStr += orgStr.charAt(0);
		newStr += ". ";
		
		int lastSpace = orgStr.lastIndexOf(' ');
		for(int i=0;i<lastSpace;i++)
		{
			if(orgStr.charAt(i)==' ')
			{
				i++;
				newStr += orgStr.charAt(i);
				newStr += ". ";
			}
		}
		
		newStr += orgStr.substring(lastSpace+1);
		
		System.out.println("The name is : "+newStr);
	}
}