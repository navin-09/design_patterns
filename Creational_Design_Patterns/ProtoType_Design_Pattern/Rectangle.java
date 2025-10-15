package Creational_Design_Patterns.ProtoType_Design_Pattern;


public class Rectangle implements Prototype {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(Rectangle source) {
        this.width = source.width;
        this.height = source.height;
        this.color = source.color;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
    }
}

