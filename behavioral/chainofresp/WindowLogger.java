public class WindowLogger extends Logger {
    @Override
    protected void display(String message) {
        System.out.println("Windows Logger "+message);
    }
}
