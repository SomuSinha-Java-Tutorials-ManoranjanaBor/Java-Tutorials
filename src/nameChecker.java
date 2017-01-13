import java.io.*;
class phoneBook
{
	String name;
	int number;
}
public class nameChecker 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		phoneBook obj[] = new phoneBook[5];
		int i;
		boolean nameFound = false;
		
		for(i=0;i<obj.length;i++)
		{
			obj[i] = new phoneBook();
			System.out.print("Enter a Name : ");
			obj[i].name = in.readLine();
			System.out.print("Enter the Phone Number : ");
			obj[i].number = Integer.parseInt(in.readLine());
		}
		
		System.out.print("Enter the name to search : ");
		String str = in.readLine();
		while(!str.equalsIgnoreCase("OVER"))
		{
			for(i=0;i<obj.length;i++)
			{
				if(str.equalsIgnoreCase(obj[i].name))
				{
					nameFound = true;
					System.out.println("Phone Number for "+obj[i].name+" is : "+obj[i].number);
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
