public abstract class Pet
{
	Mood m = new Mood();
	Hunger h = new Hunger();

	public abstract void play();
	public abstract void ignore();
	public abstract void sleep();
	public abstract void clean();
	public abstract void setName (String name);
	public abstract String getName ();
	public abstract void setGender (String gender);
	public abstract String getGender ();
}
