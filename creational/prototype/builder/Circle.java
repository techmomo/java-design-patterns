package prototype.builder;

public class Circle {
    private int radius;

    public Circle(){

    }
    @Override
    public Circle clone(){
        return new Circle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }
}
