import java.util.Observable;

public class MyObservable extends Observable {
    public void run(){
        while (true){
            setChanged();
            notifyObservers("MyObserver");
        }
    }
}
