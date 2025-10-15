package Structural_Design_Patterns.FlyWeight_Design_Pattern;

// Flyweight interface
public interface Glyph {
    void draw(int x, int y, int size, String color); // extrinsic parameters supplied by client
}
