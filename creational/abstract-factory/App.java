public class App {
    public static void main(String abc[]){
        String osType = "WIN";
        Factory factory = AbstractFactory.getFactory(osType);
        // call methods
        Computer computer = new Computer(factory);
        computer.execute();
    }
}
