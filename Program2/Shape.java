abstract public class Shape {
    protected String shapeName;

    public Shape(String s){
        shapeName = s;
    }

    abstract double area();

    public String toString(){
        String result = " shapeName " + shapeName;
        return result;
    }
}
