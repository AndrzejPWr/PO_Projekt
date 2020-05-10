package Obiekty;

abstract public class Organizm extends Obiekt
{
    public int wiek;
    public int glod;
    public int rozmiar;


    public Organizm(int predkosc, int wiek, int glod, int rozmiar) {
        super(predkosc);
        this.wiek = wiek;
        this.glod = glod;
        this.rozmiar = rozmiar;
    }


}
