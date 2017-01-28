/**
 * 	Program to show how an array can be passed to a constructor.
 */

import java.io.*;
public class arrayConstructor 
{
	int i[];
	arrayConstructor(int arr[])
	{
		i=arr;
	}
	void display()
	{
		for(int j=0;j<10;j++)
			System.out.print(i[j]+"\t");
	}
	public static void main(String args[]) throws IOException
	{
		int m[] = new int[10];
		System.out.println("Enter the array : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(int j=0;j<10;j++)
			m[j] = Integer.parseInt(in.readLine());
		
		arrayConstructor obj = new arrayConstructor(m);
		obj.display();
	}
}
