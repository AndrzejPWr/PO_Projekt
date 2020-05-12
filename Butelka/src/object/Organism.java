package object;

abstract public class Organism extends Object {
    public int age;
    public int glod;
    public int size;

    public Organism(int age, int glod, int size) {
        this.age = age;
        this.glod = glod;
        this.size = size;
    }
}
