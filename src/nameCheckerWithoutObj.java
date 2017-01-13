import java.io.*;
public class nameCheckerWithoutObj 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name[] = new String[5];
		int number[] = new int[5];
		int i;
		boolean nameFound = false;
		
		for(i=0;i<name.length;i++)
		{
			System.out.print("Enter a Name : ");
			name[i] = in.readLine();
			System.out.print("Enter the Phone Number : ");
			number[i] = Integer.parseInt(in.readLine());
		}
		
		System.out.print("Enter the name to search : ");
		String str = in.readLine();
		while(!str.equalsIgnoreCase("OVER"))
		{
			for(i=0;i<name.length;i++)
			{
				if(str.equalsIgnoreCase(name[i]))
				{
					nameFound = true;
					System.out.println("Phone Number for "+name[i]+" is : "+number[i]);
				}
			}
			if(nameFound!=true)
				System.out.println("Name NOT found");
			
			System.out.print("Enter the name to search : ");
			str = in.readLine();
			nameFound = false;
		}
	}
}
