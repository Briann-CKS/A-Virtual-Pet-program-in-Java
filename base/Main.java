import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
	
	public String name;
	public int age;
	public int type;

	public static Dog[] dogs = new Dog [10];
	public static Cat[] cats = new Cat [10];

	public static int dogNum = 0;
	public static int catNum = 0;
	public static int totdogNum = 0;
	public static int totcatNum = 0;

	public static void main (String[] args)
	{
		new Main();
		this.main_menu;
		savePet();
	}
}

public Main(){
	loadPet();
}

public void loadPet(){
	try{
	FileInputStream dog_file = new FileInputStream ("Dog.dat");
	ObjectInputStream inputD = new ObjectInputStream(dog_file);
	
	boolean keep_going = true;
	while (keep_going)
	{
		Dog[dogNum] = (Dog) inputD.readObject();
		if(Dog[dogNum] == null)
		{
			keep_going = false;
			break;
		}
		totdogNum++;
		dogNum++;
	}			

	inputP.close();
	} catch (IOException e)
	{
		//vec = new Vector();
	} catch (ClassNotFoundException e) 
	{
		System.out.println(e.getMessage());
	}
}

public void savePet(){
	try {
		FileOutputStream pet_file = new FileOutputStream("Pet.dat");
		ObjectOutputStream outputP = new ObjectOutputStream(pet_file);
		for (int i = 0; i<vec.size(); i++)
		{
			//Pet pet = new Pet();
			//pet = (Pet)vec.get(i);
			//String nam = pet.getName();
			//if (p.getName() == nam)
			{
			//	vec.set(i, p);
			//	break;
			}	
		}
		out.WriteObject(vec);
		out.close();
		pet_file.close();
	} catch (IOException e)
	{
		System.in.println(e.getMessage());
	}
}

public void main_menu(){
	int choice;
	System.out.println ("Welcome to A Perfect Pet!");
	while (keep_going)
	{
		System.out.println("\nPlease enter your choice of interaction with your pet:");
		System.out.println("1. Create a new pet\n2. Select an existing pet\n3. exit");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();		
		
		if (choice ==1)
		{
			System.out.println("Please select a pet type");
			System.out.println("\n1. Dog\n2. Cat\n3. Fish\n4. Squirrel");
			Scanner Ptype = new Scanner(System.in);
			type = Ptype.nextInt();
			System.out.println("What do you want to name your new pet?");
			Scanner Pname = new Scanner(System.in);
			name = Pname.nextLine();
			
		}



}

public static void viewDogInfo (int i)
{
	int moodValue = Dog[i].m.getMood();
	int hungerValue = Dog[i].h.getHunger();

	System.out.println ("Your dog info\n" + i+1 + ". " + Dog[i].getName() + "\nType: " + Dog[i].getType() + "\nGender: " + Dog[i].getGender() +"\nCurrent Mood Status: " + Dog[i].m.getString(moodValue) + "\nCurrent Hunger Status: " + Dog[i].h.getString(hungerValue) + "\n";

}

public static void viewCatInfo (int i)
{
	int moodValue = Cat[i].m.getMood();
        int hungerValue = Cat[i].h.getHunger();

        System.out.println ("Your cat info\n" + i+1 + ". " + Cat[i].getName() + "\nType: " + Cat[i].getType() + "\nGender: " + Cat[i].getGender() +"\nCurrent Mood Status: " + Cat[i].m.getString(moodValue) + "\nCurrent Hunger Status: " + Cat[i].h.getString(hungerValue) + "\n";

}

