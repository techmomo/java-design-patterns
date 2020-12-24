package prototype.builder;

public class Volkswagen extends Vehicle {
    String speed;

    public Volkswagen(String speed) {
        this.speed = speed;
    }

    @Override
    public Vehicle copy() { // performing deep cloning copying all the attributes
        Volkswagen volkswagenClone = new Volkswagen(this.speed);
        return volkswagenClone;
    }
}
