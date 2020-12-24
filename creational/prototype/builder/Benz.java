package prototype.builder;

public class Benz extends Vehicle {
    boolean isMayback;

    public Benz(boolean isMayback) {
        this.isMayback = isMayback;
    }

    @Override
    public Vehicle copy() {
        Benz benzClone = new Benz(this.isMayback);
        return benzClone;
    }
}
