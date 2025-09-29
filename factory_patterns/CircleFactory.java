package design_patterns.factory_patterns;

public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {

        return new Circle();
    }

}
