class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        float area = side * side;
        System.out.println("SQ AREA : "+area);
    }
}
