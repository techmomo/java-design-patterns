import java.util.Observable;
import java.util.Observer;

class MyObserver implements Observer {
    private String response;

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            response = (String) arg;
            System.out.println(response);
        }
    }
}
