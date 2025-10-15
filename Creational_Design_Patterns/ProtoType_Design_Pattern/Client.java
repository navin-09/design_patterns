package Creational_Design_Patterns.ProtoType_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(10, "Red");
        Circle clonedCircle = (Circle) originalCircle.clone();

        System.out.println("Original: " + originalCircle +System.identityHashCode(originalCircle));
        System.out.println("Clone:    " + clonedCircle + System.identityHashCode(clonedCircle));

        Rectangle originalRect = new Rectangle(5, 7, "Blue");
        Rectangle clonedRect = (Rectangle) originalRect.clone();

        System.out.println("Original: " + originalRect + System.identityHashCode(originalRect));
        System.out.println("Clone:    " + clonedRect + System.identityHashCode(clonedRect));

        PrototypeRegistry.addPrototype("bigCircle", new Circle(50, "Green"));
        Circle c = (Circle) PrototypeRegistry.getPrototype("bigCircle");
        System.out.println("Registry:    " + c);

    }
}

