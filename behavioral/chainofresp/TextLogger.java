public class TextLogger extends Logger {
    @Override
    protected void display(String message) {
        System.out.println("Text Logger "+message);
    }
}
