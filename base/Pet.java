import java.io.*;
import java.util.Scanner;

public class Pet implements Serializable {
	public String name;
	public int age;
	public String petType;

	public static void main (String[] args)
	{
		new Pet();
	}
}

public Pet(){
	loadPet();

}

public savePet(){
	try {
		FileOutputStream outfile = new FileOutputStream("pet.dat");
		ObjectOutputStream out = new ObjectOutputStream(outfile);
		out.WriteObject(this);
		out.close();
		outfile.close();
		System.out.println("Serialization done.");
	} catch (IOException e)
	{
		e.getMessage();
	}
}
