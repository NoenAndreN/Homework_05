public class Dogs extends Animals {

    public Dogs(int paws, int tail) {
        super(paws, tail);
    }

    @Override
    public String voise() {
        System.out.println("Dogs says: гав-гав!");
        return null;
    }

    @Override
    public String toString() {

        return (super.toString());
    }
}

class German_Shepherd extends Dogs {

    public German_Shepherd(int paws, int tail) {
        super(paws, tail);
    }
}


class Collie extends Dogs {

    public Collie(int paws, int tail) {
        super(paws, tail);

    }
}
