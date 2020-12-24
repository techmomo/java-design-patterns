public class CarDecorator implements Car {
    private Car car;
    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void drive() {
        this.car.drive();
        System.out.println("Car Decorator");
    }
}
