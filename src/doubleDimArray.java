import java.io.*;
public class doubleDimArray 
{
	public static void main(String args[]) throws IOException
	{
		int arr[][] = new int[3][3];
		int i,j;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				System.out.print("Enter the "+(j+1)+" element of the "+(i+1)+" row : ");
				arr[i][j]=Integer.parseInt(in.readLine());
			}
		}
		
		System.out.println("The matrix is :");
		for(i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
