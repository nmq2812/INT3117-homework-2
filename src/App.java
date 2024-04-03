import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int isExcellenceExam = sc.nextInt();
        int ans = calculateFees(age, isExcellenceExam);
        CalculateFeesTest();
        if (ans < 0)
            System.out.println("error");
        else
            System.out.println("tong so hoc phi la: " + calculateFees(age, isExcellenceExam));

    }

    public static int calculateFees(int age, int isExcellenceExam) {
        int cnt = 4;

        if (age >= 15 && age <= 17) {
            if (isExcellenceExam == 1)
                cnt--;
            if (age == 17)
                cnt -= 2;
            return (cnt * 18 * 75000);
        }

        return -1;
    }

    public class CalculateFeesTest {
        @Test
        public void testCalculateFees_15YearsOld_NoExcellenceExam() {
            int age = 15;
            int isExcellenceExam = 0;
            int expectedFees = 4 * 18 * 75000;
            assertEquals(expectedFees, CalculateFees.calculateFees(age, isExcellenceExam));
        }

        @Test
        public void testCalculateFees_16YearsOld_WithExcellenceExam() {
            int age = 16;
            int isExcellenceExam = 1;
            int expectedFees = 3 * 18 * 75000;
            assertEquals(expectedFees, CalculateFees.calculateFees(age, isExcellenceExam));
        }

        @Test
        public void testCalculateFees_17YearsOld_WithExcellenceExam() {
            int age = 17;
            int isExcellenceExam = 1;
            int expectedFees = 1 * 18 * 75000;
            assertEquals(expectedFees, CalculateFees.calculateFees(age, isExcellenceExam));
        }

        @Test
        public void testCalculateFees_17YearsOld_NoExcellenceExam() {
            int age = 17;
            int isExcellenceExam = 0;
            int expectedFees = -1; // Expected result is -1 because the age is not between 15 and 17
            assertEquals(expectedFees, CalculateFees.calculateFees(age, isExcellenceExam));
        }

        @Test
        public void testCalculateFees_14YearsOld_NoExcellenceExam() {
            int age = 14;
            int isExcellenceExam = 0;
            int expectedFees = -1; // Expected result is -1 because the age is not between 15 and 17
            assertEquals(expectedFees, CalculateFees.calculateFees(age, isExcellenceExam));
        }
    }

}
