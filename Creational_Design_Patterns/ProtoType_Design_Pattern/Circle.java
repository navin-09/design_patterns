package Creational_Design_Patterns.ProtoType_Design_Pattern;

public class Circle implements Prototype {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // copy constructor (optional)
    public Circle(Circle source) {
        this.radius = source.radius;
        this.color = source.color;
    }

    @Override
    public Prototype clone() {
        return new Circle(this); // clone using copy constructor
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
