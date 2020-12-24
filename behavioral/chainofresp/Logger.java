abstract class Logger {
    private Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void message(String message) {
        display(message);
        if (next != null) {
            next.message(message);
        }
    }

    protected abstract void display(String message);
}
