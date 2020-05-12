package object;

public class Fish extends Organism {
    public boolean drapieznosc;
    public int temperatura;
    public int n;

    public Fish(int predkosc, int wiek, int glod, int rozmiar, boolean drapieznosc, int temperatura) {
        super(predkosc, wiek, glod, rozmiar);
        this.drapieznosc = drapieznosc;
        this.temperatura = temperatura;
    }

    public void zmianaRozmiaru(Fish ryba)
    {
        if(temperatura < n) {
            ryba.rozmiar--;
        }
        }

    }

