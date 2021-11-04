import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
	public String name;
	public int age;
	public int type;

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
	FileInputStream pet_file = new FileInputStream ("Pet.dat");
	ObjectInputStream inputP = new ObjectInputStream(pet_file);
	
	//Pet pet = (Pet) inputP.readObject();

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
