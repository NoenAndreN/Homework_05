abstract public class Animals {

    public abstract String voise();
    final public int tail;
    public int paws;


    public Animals(int paws, int tail) {
        this.paws = paws;
        this.tail = tail;
    }

    public String toString() {
        return ("У тварин є " + paws + " лапи і "+ tail + " хвіст");
    }


    public static void main(String[] args) {


    }
}