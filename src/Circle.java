import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o instanceof Shape) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    public boolean equals(Circle c) {
        return this.radius == c.radius;
    }

    @Override
    public String toString() {
        return "Radius of circle is " + getRadius() + ". The square is " + getSquare() +
                ". The perimeter is " + getPerimeter();
    }

    @Override
    public double getSquare() {
        Rounder rounder = new Rounder();

        return rounder.round(2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        Rounder rounder = new Rounder();

        return rounder.round(2 * Math.PI * radius);
    }

    public int getCountAngles(){
        return 0;
    }

    public Integer getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
