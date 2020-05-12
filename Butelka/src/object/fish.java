package object;

public class fish extends Organizm {
    public boolean drapieznosc;
    public int temperatura;
    public int n;

    public fish(int predkosc, int wiek, int glod, int rozmiar, boolean drapieznosc, int temperatura) {
        super(predkosc, wiek, glod, rozmiar);
        this.drapieznosc = drapieznosc;
        this.temperatura = temperatura;
    }

    public void zmianaRozmiaru(fish ryba)
    {
        if(temperatura < n) {
            ryba.rozmiar--;
        }
        }

    }

