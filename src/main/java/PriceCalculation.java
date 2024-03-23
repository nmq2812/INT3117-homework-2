public class PriceCalculation {
    public static final int MAXIMUM_PRICE = 1000000;

    public static int calculateFinalPrice(int originalPrice) {
        if (originalPrice <= 0 || originalPrice > MAXIMUM_PRICE) {
            System.out.println("Price is invalid");
            return -1;
        }
        double discountRate = 0;
        if (originalPrice < 10000) discountRate = 0;
        else if (originalPrice < 20000) discountRate = 0.05;
        else if (originalPrice < 30000) discountRate = 0.07;
        else discountRate = 0.1;

        return (int) (originalPrice - (int)originalPrice * discountRate);
    }

    public static void main(String[] args) {
        System.out.println(calculateFinalPrice(15000));
    }
}
