package object;

public abstract class Organism extends Object {
    
	private int age;
    private int hunger;
    private int size;

    public abstract int getAge();
    public abstract void setAge();
    public abstract int getHunger();
    public abstract void setHunger();
    public abstract int setSize();
    public abstract void getSize();
    
}
