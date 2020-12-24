public class HatchBagDecorator extends CarDecorator {

    public HatchBagDecorator(Car car) {
        super(car);

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Hatch Bag Decorator");
    }
}
