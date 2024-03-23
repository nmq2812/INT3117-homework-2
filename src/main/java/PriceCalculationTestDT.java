import org.junit.Test;
import static org.junit.Assert.*;
public class PriceCalculationTestDT {
    @Test
    public void test_001() {
        assertEquals(-1, PriceCalculation.calculateFinalPrice(-20));
    }
    @Test
    public void test_002() {
        assertEquals(500, PriceCalculation.calculateFinalPrice(500));
    }
    @Test
    public void test_003() {
        assertEquals(16150, PriceCalculation.calculateFinalPrice(17000));
    }
    @Test
    public void test_004() {
        assertEquals(23250, PriceCalculation.calculateFinalPrice(25000));
    }
    @Test
    public void test_005() {
        assertEquals(81000, PriceCalculation.calculateFinalPrice(90000));
    }
    @Test
    public void test_006() {
        assertEquals(-1, PriceCalculation.calculateFinalPrice(2000000));
    }

}
