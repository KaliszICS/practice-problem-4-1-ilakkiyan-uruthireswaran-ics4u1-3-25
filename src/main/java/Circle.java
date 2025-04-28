public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return 3.14*(radius*radius);
    }

    public double circumference() {
        return 2*3.14*radius;
    }
}
