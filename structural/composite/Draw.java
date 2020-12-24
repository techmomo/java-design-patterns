import java.util.ArrayList;
import java.util.List;

public class Draw implements Shape1 {
// Composite

    // leaves
    List<Shape1> leaves = new ArrayList<Shape1>();

    @Override
    public void display(String name) {
        leaves.forEach(shape1 ->{
            shape1.display(name);
        });
    }

    // implementation methods
    public void add(Shape1 s){
        this.leaves.add(s);
    }

    public void remove(Shape1 s){
        this.leaves.remove(s);
    }

}

//Composite Pattern has 3 layers
//1. Base COmponent
//2. Leaves
//3. Composite Layer

