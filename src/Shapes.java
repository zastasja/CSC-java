public abstract class Shapes {
    private final Color color;
    public Shapes(Color color) {
        this.color = color;
    }

    public Color getColor(){return color;}
    public abstract double getArea();
}

