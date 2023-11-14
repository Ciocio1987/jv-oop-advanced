package core.basesyntax;

public class Circle extends Figure implements AreaCalculaton,PrintInfo {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInformation() {
        return "Figure" + " " + "Circle" + " " + "Radius" + " " + radius + " " + "Area" + " "
                + getArea() + " " + "Color" + " " + color;
    }
}
