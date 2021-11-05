public abstract class Attribute {

	public int mood = 0;
	public int hunger = 0;

	public abstract int getMood();
	public abstract void setMood(int num);
	public abstract void increaseMood();
	public abstract void decreaseMood();

	public abstract int getHunger();
	public abstract void setHunger(int num);
	public abstract void increaseHunger();
	public abstract void decreaseHunger();

}
