public class Hunger extends Attributes
{
	public static final int famished = 0;
	public static final int content = 1;
	public static final int bloated = 2;

	public static void main (String[] args)
	{
		new Hunger();
	}	

	public Hunger()
	{
		setHunger (famished);	
	}

	public int getHunger()
	{
		return hunger;
	}

	public void setHunger(int num)
	{
		hunger = num;
	}

	public void increaseHunger()
	{
		if (hunger > famished)
		{
			hunger--;
		}
		else
		{
			System.out.println ("Your pet is famished, feed it some food!");
		}
		
		if (hunger == 0 || hunger == 1 || hunger == 2)
                {       
                        System.out.println ("\n Your pet is currently " + getHungerString(hunger) + "\n");
                }
                else
                {       
                        System.out.println ("No valid hunger status at the moment!");
                }	

	}

	public void decreaseHunger()
	{
		if (hunger < bloated)
		{
			hunger++;
		}
	
		else
		{
			System.out.println ("Your pet is bloated, stop feeding it!");
		}
		
		if (hunger == 0 || hunger == 1 || hunger == 2)
                {
			System.out.println ("\n Your pet is currently " + getHungerString(hunger) + "\n");
                }
                else
                {
                        System.out.println ("No valid hunger status at the moment!");
                }

	}

	public String getHungerString (int num)
	{
		String strH = new String ("");
		
		if (num == 0)
		{
			strH = "Famished";
		}
		
		else if (num == 1)
		{
			strH = "Content";
		}

		else if (num == 2)
		{
			strH = "Bloated";
		}

		else
		{
			strM = "Unknown";
		}
		
		return strH;
	}		
}
