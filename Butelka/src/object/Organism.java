package object;

<<<<<<< HEAD
public abstract class Organism extends Object {
    
	private int age;
    private int hunger;
    private int size;
=======
abstract public class Organism extends Object {
    public int age;
    public int hunger;
    public int size;
>>>>>>> branch 'master' of https://github.com/AndrzejPWr/PO_Projekt.git

<<<<<<< HEAD
    public abstract int getAge();
    public abstract void setAge();
    public abstract int getHunger();
    public abstract void setHunger();
    public abstract int setSize();
    public abstract void getSize();
    //test
=======
    public Organism(int age, int hunger, int size) {
        this.age = age;
        this.hunger = hunger;
        this.size = size;
    }
>>>>>>> branch 'master' of https://github.com/AndrzejPWr/PO_Projekt.git
}
