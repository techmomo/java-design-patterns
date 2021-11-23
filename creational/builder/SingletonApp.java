public class SingletonApp {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

        // not permitted
        //Singleton singleton1 = new Singleton();
    }
}
