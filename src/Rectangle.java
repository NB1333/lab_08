import java.util.Objects;

public class Rectangle extends Shape{
    private int Aside;
    private int Bside;

    public Rectangle(int aside, int bside){
        super(4);
        this.Aside = aside;
        this.Bside = bside;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o instanceof Shape) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.Aside, Aside) == 0 && Double.compare(rectangle.Bside, Bside) == 0;
    }

    @Override
    public String toString() {
        return "Sides of rectangle:\n" + "a = " + Aside + " b = " + Bside + "\nThe square is " + getSquare() +
                ". The perimeter is " + getPerimeter();
    }

    @Override
    double getSquare() {
        Rounder rounder = new Rounder();

        return rounder.round(Aside * Bside);
    }

    @Override
    double getPerimeter() {
        Rounder rounder = new Rounder();

        return rounder.round((Aside + Bside) * 2);
    }

    public double getDiagonal(double A, double B) {
        return  Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
    }

    public int getCountOfAngles() {
        return 4;
    }

    public double getAside(){
        return Aside;
    }

    public double getBside(){
        return Bside;
    }

    public void setAside(int A){
        this.Aside = A;
    }

    public void setBside(int B){
        this.Bside = B;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Aside, Bside);
    }
}
