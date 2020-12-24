public class DecoratorApp {
    public static void main(String[] args) {
        Car fourXfour = new FourXFourDecorator(new FourWheeler());
        fourXfour.drive();

        Car hatchBag = new FourXFourDecorator(new HatchBagDecorator(new FourWheeler()));
        hatchBag.drive();
        //
        Car plainHatchBag = new HatchBagDecorator(new FourWheeler());
        hatchBag.drive();
    }
}
