import java.io.*;
class salesman
{
	static double sTc,sTp,comTc,comTp;
	int nTc,nTp;
	double totS,totC;
	
	static void getInput() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Price of Talc Powder : ");
		sTc = Double.parseDouble(in.readLine());
		System.out.print("Enter Price of Tooth Powder : ");
		sTp = Double.parseDouble(in.readLine());
		
		comTc = 15.0;
		comTp = 20.0;
	}
	
	salesman(int nTc, int nTp)
	{
		this.nTc = nTc;
		this.nTp = nTp;
	}
	
	void calc()
	{
		totS = sTc*nTc + sTp*nTp;
		totC = comTc*sTc*0.01*nTc + comTp*sTp*0.01*nTp;
	}
	
	void display()
	{
		System.out.println("Salesman Sales Details : ");
		System.out.println("Number of Talcum Powders Sold = "+nTc);
		System.out.println("Number of Tooth Powders Sold = "+nTp);
		System.out.println("Total Sales = "+totS);
		System.out.println("Total Commission = "+totC);
	}
}

public class salesDemo 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		salesman.getInput();
		salesman obj[] = new salesman[100];
		
		double totalSales, totalCommission;
		totalSales = totalCommission = 0;
		
		for(int i=0;i<obj.length;i++)
		{
			int nTc, nTp;
			System.out.print("Enter Units of Talcum Powder Sold : ");
			nTc = Integer.parseInt(in.readLine());
			System.out.print("Enter Units of Tooth Powder Sold : ");
			nTp = Integer.parseInt(in.readLine());
			obj[i] = new salesman(nTc, nTp);
			obj[i].calc();
			totalSales += obj[i].totS;
			totalCommission += obj[i].totC;
		}
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i].display();
		}
		System.out.println("Overall Sales : "+totalSales);
		System.out.println("Overall Commission : "+totalCommission);
	}
}
