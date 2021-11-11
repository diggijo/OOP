package Lab9.Exercise2;

public abstract class Shape {

    protected String type;

    public Shape(String type){
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double area();
    public abstract double perimeter();
}
