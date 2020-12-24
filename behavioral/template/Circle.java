class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = 2 * Math.PI * radius;
        System.out.println("Circle AREA: "+area);
    }
}
