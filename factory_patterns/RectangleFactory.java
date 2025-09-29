package design_patterns.factory_patterns;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {

        return new Rectangle();

    }
}
