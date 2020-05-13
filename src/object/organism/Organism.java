package object.organism;

public abstract class Organism implements Object {
    
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
    
}
