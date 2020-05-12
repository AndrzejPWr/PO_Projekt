package object;

public abstract class Organism extends Object {

    private int age;
    private int hunger;
    private int size;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
