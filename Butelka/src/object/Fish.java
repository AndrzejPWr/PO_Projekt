package object;

    public class Fish extends Organism {
    private boolean rapacity ;
    private int temperature;
    private int n;

        public boolean isRapacity() {
            return rapacity;
        }

        public void setRapacity(boolean rapacity) {
            this.rapacity = rapacity;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }
    }

