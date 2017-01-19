/**
 * WAP to design a method which will take 3 numbers from main() then display highest, lowest and middle number within it using the following method prototype:
 * void number(int,int,int)
 */

import java.util.Scanner;
public class OrderNumbers 
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.print("ENTER THREE NUMBERS :");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int n3=in.nextInt();
		number(n1,n2,n3);
	}
	
	static void number(int a,int b,int c)
	{
		int arr[]=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		int i,j,t;
		for(i=0;i<2;i++)
		{
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("Highest number:"+arr[2]);
		System.out.println("middle number:"+arr[1]);
		System.out.println("lowest number:"+arr[0]);
	}
}
