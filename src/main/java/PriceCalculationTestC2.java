import org.junit.Test;
import static org.junit.Assert.*;
public class PriceCalculationTestC2 {
    public void test_01() {
        assertEquals(-1, PriceCalculation.calculateFinalPrice(-10));
    }
    @Test
    public void test_02() {
        assertEquals(9000, PriceCalculation.calculateFinalPrice(9000));
    }
    @Test
    public void test_03() {
        assertEquals(14250, PriceCalculation.calculateFinalPrice(15000));
    }
    @Test
    public void test_04() {
        assertEquals(23250, PriceCalculation.calculateFinalPrice(25000));
    }
    @Test
    public void test_05() {
        assertEquals(31500, PriceCalculation.calculateFinalPrice(35000));
    }
}
