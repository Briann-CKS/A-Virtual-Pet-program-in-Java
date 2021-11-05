import java.util.Scanner;
import java.io.*;

public class Dog extends Pet implements java.io.Serializable
{
	public String dogName = new String("");
	public String dogType = new String("");
	public String dogGender = new String ("");

	public static void main (String[] args)
	{
		new Dog();
		Dog dog = new Dog();
		boolean keep_going = true;
		while (keep_going)
		{
			System.out.println ("\nWhat do you want to do with your dog?");
			System.out.println ("\n1. Play\n2. Ignore\n3. Clean\n4.Sleep\n5. Feed\n6. Exit\n");
		
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();

			if (choice == 1)
			{
				dog.play();
			}
			else if (choice == 2)
			{
				dog.ignore();
			}
			else if (choice == 3)
			{
				dog.clean();
			}
			else if (choice == 4)
			{
				dog.sleep();
			}
			else if (choice == 5)
			{
				dog.feed();
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
		return dogName;
	}

	public void setName (String nam)
	{
		dogName = nam;
	}

	public String getType ()
	{
		return dogType();
	}

	public void setType (String typ)
	{
		dogType = typ;
	}

	public String getGender ()
	{
		return dogGender;
	}

	public void setGender (String gen)
	{
		dogGender = gen;
	}

	public void insertData (String nam, String typ, String gen)
	{
		dogName = name;
		dogType = typ;
		dogGender = gen;
	}
}
