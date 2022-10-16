public class Cats extends Animals {

    public Cats(int paws, int tail) {
        super(paws, tail);
    }

    @Override
    public String voise() {
        System.out.println("Cats says: няв!");
        return null;
    }

    @Override
    public String toString() {
        return (super.toString());
    }
}

class Turkish_angora extends Cats {

    public Turkish_angora(int paws, int tail) {
        super(paws, tail);
    }
}