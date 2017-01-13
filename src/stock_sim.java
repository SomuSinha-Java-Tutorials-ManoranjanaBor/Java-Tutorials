import java.io.*;
class Stock_Purchase
{
	private String itemName;
	private float rate;
	private float Amt;
	private int Pqty;
	private int qty;
	private float Prate;
	
	Stock_Purchase(String name,int qty, float rate, int Pqty, float Prate)
	{
		this.itemName = name; 
		this.rate = rate;
		this.qty = qty;
		this.Amt = this.rate * this.qty;
		this.Pqty = Pqty;
		this.Prate = Prate;
	}
	
	void update()
	{
		qty += Pqty;
		rate = Prate;
		Amt = rate * qty;
	}
	
	void display()
	{
		System.out.println("\nStock details :");
		System.out.println("Item Name : "+itemName);
		System.out.println("Quantity Available : "+qty);
		System.out.println("Unit Price : "+rate);
		System.out.println("Amount : "+Amt);	
	}
}

public class stock_sim 
{
	public static void main(String args[])throws IOException
	{		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name of Item : ");
		String name = in.readLine();
		System.out.print("Enter the original Quantity : ");
		int qty = Integer.parseInt(in.readLine());
		System.out.print("Enter the original Rate : ");
		float rate = Float.parseFloat(in.readLine());
		System.out.print("Enter the Purchase Quantity : ");
		int Pqty = Integer.parseInt(in.readLine());
		System.out.print("Enter the Purchase Rate : ");
		float Prate = Float.parseFloat(in.readLine());
		
		Stock_Purchase shop = new Stock_Purchase(name,qty,rate,Pqty,Prate);
		shop.display();
		shop.update();
		System.out.println("\nStock Updated.");
		shop.display();
	}
}
