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
