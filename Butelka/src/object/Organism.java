package object;

public abstract class Organism extends Object {

    private int age;
    private int hunger;
    private int size;
    
    @Override
    public Position getPosition();
    public abstract int getAge();
    public abstract void setAge();
    public abstract int getHunger();
    public abstract void setHunger();
    public abstract int setSize();
    public abstract void getSize();
    public void move();
    public void eat();
    //test
    


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
