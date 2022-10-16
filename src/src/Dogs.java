public class Dogs extends Animals {

    public Dogs(int paws, int tail) {
        super(paws, tail);
    }

    @Override
    public String voise() {
        System.out.println("Dogs says: гав-гав!");
        return null;
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
