public class Cats extends Animals {

    public Cats(int paws, int tail) {
        super(paws, tail);
    }

    @Override
    public String voise() {
        System.out.println("Cats says: няв!");
        return null;
    }
}

class Turkish_angora extends Cats {

    public Turkish_angora(int paws, int tail) {
        super(paws, tail);
    }
}