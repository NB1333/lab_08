import java.util.Comparator;

public class Compare {

    //inner class
    static class orderedCompare {
        Comparator<Rectangle> compareRectangleAside = (ra1, ra2) -> (int) (ra1.getAside() - ra2.getAside());
        Comparator<Rectangle> compareRectangleBside = (ra1, ra2) -> (int) (ra1.getBside() - ra2.getBside());



    }

    //anonymous class
    Comparator<Circle> compareCircle = new Comparator<Circle>() {
        @Override
        public int compare(Circle o1, Circle o2) {
            Comparator<Circle> radiusComparator = (c1, c2) -> (int) (c1.getRadius() - c2.getRadius());
            return 0;
        }
    };
}
