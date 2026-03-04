public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double w, double l){
        super("Rectangle");
        width = w;
        length = l;
    }

    public double area(){
        return width * length;
    }

    public String toString(){
        return super.toString() + " of Rectangle " + width + length;
    }
}
