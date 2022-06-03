public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Circle circle2 = new Circle(7);

        Rectangle rect = new Rectangle(12, 7);
        Rectangle rect2 = new Rectangle(15, 3);

        System.out.println(rect + "\n\n" + rect2 + "\n\n" + rect.equals(rect2));
        System.out.println("\n\n" + circle + "\n\n" + circle2 + "\n\n" + circle.equals(circle2));



    }
}