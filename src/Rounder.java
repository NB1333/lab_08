import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounder {
    public double round(double value) {
        BigDecimal valueBigDecimal = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);

        return valueBigDecimal.doubleValue();
    }
}
