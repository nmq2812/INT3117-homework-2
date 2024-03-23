import org.junit.Test;
import static org.junit.Assert.*;


public class PriceCalculationTestEP {
    @Test
    public void test_001() {
        assertEquals(-1, PriceCalculation.calculateFinalPrice(-10));
    }
    @Test
    public void test_002() {
        assertEquals(100, PriceCalculation.calculateFinalPrice(100), 0.0f);
    }
    @Test
    public void test_003() {
        assertEquals(14250, PriceCalculation.calculateFinalPrice(15000));
    }
    @Test
    public void test_004() {
        assertEquals(21390, PriceCalculation.calculateFinalPrice(23000));
    }
    @Test
    public void test_005() {
        assertEquals(45000, PriceCalculation.calculateFinalPrice(50000));
    }
    @Test
    public void test_006() {
        assertEquals(-1, PriceCalculation.calculateFinalPrice(1500000));
    }

}
