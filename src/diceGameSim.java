import java.io.*;

class game
{
	String name;
	int playerNum;
	int count;
	int score;
	
	
	public void input() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Name : ");
		name = in.readLine();
		System.out.print("Enter the Player Number : ");
		playerNum = Integer.parseInt(in.readLine());
		System.out.println();
		
		count = 0;
		score = 0;
	}
	
	public void calculate()
	{
		while(score<20)
		{
			int dice = (int)(Math.random()*6)+1;
			count++;
			score+=dice;
		}
	}
	
	public void display()
	{
		System.out.println("Player Name : "+name);
		System.out.println("Player Num : "+playerNum);
		System.out.println("Score : "+score);
		System.out.println("Number of throws : "+count);
		System.out.println();
	}
	
	public void computeResult(game player)
	{
		if(this.count>player.count)
		{
			System.out.println(player.name+" Wins!");
		}
		else if(this.count<player.count)
		{
			System.out.println(this.name+" Wins!");
		}
		else
		{
			System.out.println("Draw!");
		}
	}
}

public class diceGameSim 
{
	public static void main(String args[])throws IOException
	{
		game player1 = new game(), player2 = new game();
		player1.input();
		player2.input();
		player1.calculate();
		player2.calculate();
		player1.display();
		player2.display();
		player1.computeResult(player2);
		
	}
}
