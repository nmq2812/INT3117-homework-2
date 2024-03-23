import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculationTestAlluses {
    @Test
    public void test_01() {
        assertEquals(45000, PriceCalculation.calculateFinalPrice(50000));
    }
    @Test
    public void test_02() {
        assertEquals(-1, PriceCalculation.calculateFinalPrice(-15000));
    }
    @Test
    public void test_03() {
        assertEquals(9000, PriceCalculation.calculateFinalPrice(9000));
    }
    @Test
    public void test_04() {
        assertEquals(14250, PriceCalculation.calculateFinalPrice(15000));
    }
    @Test
    public void test_05() {
        assertEquals(23250, PriceCalculation.calculateFinalPrice(25000));
    }
}
