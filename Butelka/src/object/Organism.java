package object;

abstract public class Organism extends Object {
    public int wiek;
    public int glod;
    public int rozmiar;


    public Organism(int predkosc, int wiek, int glod, int rozmiar) {
        super(predkosc);
        this.wiek = wiek;
        this.glod = glod;
        this.rozmiar = rozmiar;
    }
}
