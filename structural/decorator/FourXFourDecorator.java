public class FourXFourDecorator extends CarDecorator {

    public FourXFourDecorator(Car car) {
        super(car);

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("FourxFour Decorator");
    }
}
