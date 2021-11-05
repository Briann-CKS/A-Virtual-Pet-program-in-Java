import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
	
	public String name;
	public String gender;
	public String type;

	public static Dog[] dogs = new Dog [10];
	public static Cat[] cats = new Cat [10];

	public static int dogNum = 0;
	public static int catNum = 0;
	public static int totdogNum = 0;
	public static int totcatNum = 0;

	public static void main (String[] args)
	{
		new Main();
		main_menu();
		savePet();
	}

	public Main()
	{
		loadPet();
	}

	public void loadPet()
	{	
		boolean keep_going = true;
		try{
		FileInputStream dog_file = new FileInputStream ("Dog.dat");
		ObjectInputStream inputD = new ObjectInputStream(dog_file);
	
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
		dog_file.close();
		inputD.close();
		} catch (IOException e){
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e){
			System.out.println(e.getMessage());
		}

		keep_going = true;
		try{
        	FileInputStream cat_file = new FileInputStream ("Cat.dat");
	        ObjectInputStream inputC = new ObjectInputStream(cat_file);

        	while (keep_going)
        	{
                	Cat[catNum] = (Cat) inputC.readObject();
                	if(Cat[catNum] == null)
                	{
                	        keep_going = false;
                        	break;
                	}
                	totcatNum++;
                	catNum++;
        	}

        	cat_file.close();
 	       inputC.close();
        	} catch (IOException e){
                	System.out.println(e.getMessage());
        	} catch (ClassNotFoundException e){
                	System.out.println(e.getMessage());
        	}
	}

	public void savePet()
	{
		try {
		FileOutputStream dog_file = new FileOutputStream("Dog.dat");
		ObjectOutputStream outputD = new ObjectOutputStream(dog_file);
		for (int i = 0; i<totdogNum; i++)
		{
			outputD.writeObject(Dog[i]);
		}
		dog_file.close();
		outputD.close();
		} catch (IOException e)
		{
		System.out.println(e.getMessage());
		}

		try {
                FileOutputStream cat_file = new FileOutputStream("Cat.dat");
                ObjectOutputStream outputC = new ObjectOutputStream(cat_file);
                for (int i = 0; i<totcatNum; i++)
                {       
                        outputC.writeObject(Cat[i]);
                }
                cat_file.close();
                outputC.close();
        	} catch (IOException e)
        	{
                System.out.println(e.getMessage());
        	}
	}

	public void main_menu()
	{
		int choice;
		System.out.println ("Welcome to A Perfect Pet!");
		boolean keep_going = true;
		while (keep_going)
		{
			System.out.println("\nPlease enter your choice of interaction with your pet:");
			System.out.println("1. Create a new pet\n2. Select an existing dog\n3. Select an existing cat\n4. List dogs\n5. List cats\n6. Exit\n");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();		
			Scanner in = new Scanner(System.in);
		
			if (choice ==1)
			{
				System.out.println("Please select a pet to be created:");
				System.out.println("\n1. Dog\n2. Cat\n");
				Scanner option = new Scanner(System.in);
				int ch = option.nextInt();
				if (ch == 1)
				{
					if(totdogNum >= 10)
					{
						System.out.println ("Total dog number limit reached!\n");
						continue;
					}
					else 
					{
						System.out.println ("Please enter the name of your dog:\n ");
						name = in.nextLine();

						System.out.println ("Please enter the type of your dog:\n ");
						type = in.nextLine();

						System.out.println ("Please enter the gender of your dog:\n");
						gender = in.nextLine();

						Dog[dogNum].insertData(name, type, gender);

						dogNum++;
						totdogNum++;
					}
				}
				else if (ch == 2)
				{
					if(totcatNum >= 10)
                        	        {
                        	                System.out.println ("Total cat number limit reached!\n");
                        	                continue;
                        	        }
                        	        else
                        	        {
                        	                System.out.println ("Please enter the name of your cat:\n ");
                        	                name = in.nextLine();

                                	        System.out.println ("Please enter the type of your cat:\n ");
                                	        type = in.nextLine();
	
        	                                System.out.println ("Please enter the gender of your cat:\n");
        	                                gender = in.nextLine();
	
	                                        Cat[catNum].insertData(name, type, gender);
	
        	                                catNum++;
        	                                totcatNum++;
        	                        }
				}
	
				else
				{
					System.out.println ("This is not a valid choice!");
				}
			}

			else if (choice == 2)
			{	
				boolean cont = true;
        	                while (cont)
        	                {
					System.out.println("Please choose a dog or press 0 to exit\n");			
					for (int i = 0; i<totdogNum; i++)
					{
						viewdogInfo(i);
					}
					Scanner inp = new Scanner (System.in);
					int pick = inp.nextInt();
					if (pick == 0)
					{
						break;
					}
					else if (pick <= totdogNum)
					{
						int subch = 0;
						boolean more = true;
						while (more)
						{
							System.out.println("Enter Choice:\n1. Play\n2.Ignore\n3. Clean \n4. Sleep\n5. Feed\n6.Exit");
							subch = inp.nextInt();
							if(subch == 1){
								Dog[pick - 1].play();
							}
							else if(subch == 2){
								Dog[pick - 1].ignore();
							}
							else if(subch == 3){
								Dog[pick - 1].clean();
							}
							else if(subch == 4){
        	                                                Dog[pick - 1].sleep();
        	                                        }
							else if(subch == 5){
        	                                                Dog[pick - 1].feed();
        	                                        }
							else if(subch == 6)
							{
								more = false;
								break;
	                                                }
							else
        	                                        {
        	                                                System.out.println("Not a valid choice!");
       	       		                                }
                                        	}

					}
					else 
					{
						System.out.println ("The Dog you selected is not found!");
					}
				}	
			}	

			else if (choice ==3)
			{
				boolean cont = true;
                	        while (cont)
                	        {
                	                System.out.println("Please choose a cat or press 0 to exit\n");
                	                for (int i = 0; i<totcatNum; i++)
                	                {
                	                        viewcatInfo(i);
                	                }
                	                Scanner inp = new Scanner (System.in);
                	                int pick = inp.nextInt();
                	                if (pick == 0)
                	                {
                	                        break;
                	                }
                	                else if (pick <= totcatNum)
                	                {
                	                        int subch = 0;
                	                        boolean more = true;
                	                        while (more)
                	                        {
                	                                System.out.println("Enter Choice:\n1. Play\n2.Ignore\n3. Clean \n4. Sleep\n5. Feed\n6.Exit");
                	                                subch = inp.nextInt();
                	                                if(subch == 1){
                	                                        Cat[pick - 1].play();
                	                                }
                	                                else if(subch == 2){
                	                                        Cat[pick - 1].ignore();
                	                                }
                	                                else if(subch == 3){
               		                                        Cat[pick - 1].clean();
               	                                	}
                	                                else if(subch == 4){
                                                    	    Cat[pick - 1].sleep();
                                                	}
                                                	else if(subch == 5){
                                                	        Cat[pick - 1].feed();
                                                	}
                                                	else if(subch == 6)
                                               		{
                                                	        more = false;
                                                	        break;
                                                	}
							else
							{
								System.out.println("Not a valid choice!");
							}
                                       		}	
                                	}		
                                	else
                                	{
                                	        System.out.println ("The cat you selected is not found!");
                                	}
                        	}

			}

			else if (choice == 4)
			{
				System.out.println("All the dogs: \n");
				for(int i = 0; i<totdogNum; i++)
				{
					viewDogInfo(i);
				}
			}

			else if (choice == 5)
			{
				System.out.println("All the cats: \n");
        	                for(int i = 0; i<totcatNum; i++)
        	                {
        	                        viewcatInfo(i);
                        	}
			}

			else if (choice == 6)
			{
				System.out.println ("Thank you for using this Perfect Pet Program!");
				keep_going = false;			
			}

			else
			{
				System.out.println ("Not a valid choice!");
			}

	}

	public static void viewDogInfo (int i)
	{
		int moodValue = Dog[i].m.getMood();
		int hungerValue = Dog[i].h.getHunger();
	
		System.out.println ("Your dog info\n" + i+1 + ". " + Dog[i].getName() + "\nType: " + Dog[i].getType() + "\nGender: " + Dog[i].getGender() +"\nCurrent Mood Status: " + Dog[i].m.getString(moodValue) + "\nCurrent Hunger Status: " + Dog[i].h.getString(hungerValue) + "\n");

	}

	public static void viewCatInfo (int i)
	{	
		int moodValue = Cat[i].m.getMood();
        	int hungerValue = Cat[i].h.getHunger();

        	System.out.println ("Your cat info\n" + i+1 + ". " + Cat[i].getName() + "\nType: " + Cat[i].getType() + "\nGender: " + Cat[i].getGender() +"\nCurrent Mood Status: " + Cat[i].m.getString(moodValue) + "\nCurrent Hunger Status: " + Cat[i].h.getString(hungerValue) + "\n");

	}
}
