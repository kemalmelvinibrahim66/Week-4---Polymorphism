public class Cylinder extends Shape {
    protected double radius;
    protected double heigth;

    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        heigth = h;
    }

    public double area(){
        return Math.PI*radius*radius*heigth;
    }

    public String toString(){
        return super.toString() + " of Cylinder " + radius + heigth;
    }
}
