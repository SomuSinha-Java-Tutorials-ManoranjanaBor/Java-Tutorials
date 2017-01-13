import java.io.*;
public class linearSearch 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[]={1,2,3,4,5,6,7,8,9,10}; 
		int flag=0,pos=-1;
		
		System.out.print("Enter number to search : ");
		int n = Integer.parseInt(in.readLine());
		
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag = 1;
				pos = i;
			}
		}
		
		if(flag==1)
			System.out.println("The Number is found at position a["+pos+"]");
		else
			System.out.println("Number Not found");
	}
}
