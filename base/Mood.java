import java.io.*;

public class Mood extends Attribute implements Serializable {
	
	public static final int sad = 0;
	public static final int moody = 1;
	public static final int neutral = 2;
	public static final int happy = 3;
	public static final int thrilled = 4;

	public static void main (String[] args)
	{
		new Mood();
	}

	public Mood()
	{
		setMood(sad);
	}
		
	public void setMood (int num) 
	{
		mood = num;
	}

	public int getMood ()
	{
		return mood;
	}

	public void decreaseMood ()
	{
		if (mood > sad)
		{
			mood--;
		}
		else
		{
			System.out.println ("Your pet is already crazy depressed, do something!");
		}

		if (mood == 0 || mood == 1 || mood == 2 || mood == 3 || mood == 4)
		{
			System.out.println ("\nYour pet is currently " + getMoodString(mood) + "\n");
		}
		else 
		{
			System.out.println ("No valid mood at the moment!");
		}			
	}

	public void increaseMood ()
	{
		if (mood < thrilled)
		{
			mood++;
		}
		else
		{
			System.out.println ("Your pet is already crazy happy!");
		}
		
		if (mood == 0 || mood == 1 || mood == 2 || mood == 3 || mood == 4)
                {
                        System.out.println ("\nYour pet is currently " + getMoodString(mood) + "\n");
                }
                else
                {
                        System.out.println ("No valid mood at the moment!");
                }
	}
	
	public String getMoodString(int num)
	{
		String strM = new String("");
		
		if (num == 0)
		{
			strM = "Sad";
		}
		
		else if (num == 1)
		{
                        strM = "Moody";
                }

		else if (num == 2)
                {
                        strM = "Neutral";
                }

		else if (num == 3)
                {
                        strM = "Happy";
                }

		else if (num == 4)
                {
                        strM = "Thrilled";
		}

		else
		{
			strM = "Unknown";
		}

		return strM;
	}

	public void decreaseHunger(){
	}

	public void increaseHunger(){
	}

	public void setHunger (int num){
	}

	public int getHunger(){
		return 0;
	}
}


