import java.util.Scanner;
import java.io.*;

public class Cat extends Pet implements java.io.Serializable
{
	public String catName = new String("");
	public String catType = new String("");
	public String catGender = new String ("");

	public static void main (String[] args)
	{
		new Cat();
		Cat cat = new Cat();
		boolean keep_going = true;
		while (keep_going)
		{
			System.out.println ("\nWhat do you want to do with your cat?");
			System.out.println ("\n1. Play\n2. Ignore\n3. Clean\n4.Sleep\n5. Feed\n6. Exit\n");
		
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();

			if (choice == 1)
			{
				cat.play();
			}
			else if (choice == 2)
			{
				cat.ignore();
			}
			else if (choice == 3)
			{
				cat.clean();
			}
			else if (choice == 4)
			{
				cat.sleep();
			}
			else if (choice == 5)
			{
				cat.feed();
			}
			else if (choice == 6)
			{
				keep_going = false;
				System.out.println ("Thanks for spending your time with your pet!");
			}
			else
			{
				System.out.println ("Not a valid option! Try again.");
			}

		}

	}

	public void play()
	{
		m.increaseMood();
		h.increaseHunger();
	}

	public void ignore ()
	{
		m.decreaseMood();
		h.increaseHunger();
	}

	public void clean ()
	{
		m.increaseMood();
	}

	public void sleep ()
	{
		m.increaseMood();
	}

	public void feed ()
	{
		m.increaseMood();
		h.decreaseHunger();
	}

	public String getName()
	{
		return catName;
	}

	public void setName (String nam)
	{
		catName = nam;
	}

	public String getType ()
	{
		return catType;
	}

	public void setType (String typ)
	{
		catType = typ;
	}

	public String getGender ()
	{
		return catGender;
	}

	public void setGender (String gen)
	{
		catGender = gen;
	}

	public void insertData (String nam, String typ, String gen)
	{
		catName = nam;
		catType = typ;
		catGender = gen;
	}
}
