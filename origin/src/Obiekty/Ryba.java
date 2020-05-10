package Obiekty;

public class Ryba extends Organizm {
    public boolean drapieznosc;
    public int temperatura;
    public int n;

    public Ryba(int predkosc, int wiek, int glod, int rozmiar, boolean drapieznosc, int temperatura) {
        super(predkosc, wiek, glod, rozmiar);
        this.drapieznosc = drapieznosc;
        this.temperatura = temperatura;
    }


    public void zmianaRozmiaru(Ryba ryba)
    {
        if (temperatura < n)
        {
            ryba.rozmiar--;
        }
    }

}




