package object;

    public class Fish extends Organism {
    public boolean rapacity ;
    public int temperature;
    public int n;

        public Fish(int age, int glod, int size, boolean rapacity, int temperature) {
            super(age, glod, size);
            this.rapacity = rapacity;
            this.temperature = temperature;
        }

        public void changeSize(Fish fish)
        {
        if(temperature < n) {
            fish.size--;
        }
        }

    }

