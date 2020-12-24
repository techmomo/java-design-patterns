public class Singleton {
    private static Singleton _instance = null;

    private Singleton() {

    }

    // eager initialization
    public static Singleton getInstance() {
        _instance = new Singleton();
        return _instance;
    }

    // lazy
    public static Singleton getLazyInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }

    // thread safe
    // but poor performance
    public static synchronized Singleton getThreadSafeInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }

    // thread safe lazy with double entry
    // poor impact can be seen however better than synchronised method
    public static Singleton getDoubleCheckedInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    // Bill Pugh Approach using inner class
    // efficient way of creating singleton
    // doesnt load in memory till the call happens through
    // Post java 5
    private static class Inner {
        private static final Singleton _instance = new Singleton();
    }

    public static Singleton getBillPubhInstance() {
        return Inner._instance;
    }

    public void sayHello() {
        System.out.println("Singleton Says Hello");
    }
}
