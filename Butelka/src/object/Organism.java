package object;

abstract public class Organism extends Object {
    public int age;
    public int hunger;
    public int size;

    public Organism(int age, int hunger, int size) {
        this.age = age;
        this.hunger = hunger;
        this.size = size;
    }
}
