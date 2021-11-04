import java.util.*;

public class Hunger {

	protected int foodAmount;

	public static void main (String[] args)
	{
		new Hunger();
	}	

	public Hunger()
	{
		this.foodAmount = 0;	
	}

	public void Food()
	{
		this.foodAmount += 10;
	}

	public void noFood()
	{
		this.foodAmount -= 10;
	}	
}
