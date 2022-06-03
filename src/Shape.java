abstract class Shape {
    protected int countOfAngles;

    protected Shape(int countOfAngles) {
        this.countOfAngles = countOfAngles;
    }


    abstract double getSquare();

    abstract double getPerimeter();
}
