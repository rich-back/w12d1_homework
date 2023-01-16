import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(10, 2);
    }

    @Test
    public void canAdd() {
        assertEquals(12, calculator.add());
    }

    @Test
    public void canSubtract() {
        assertEquals(8, calculator.subtract());
    }

    @Test
    public void canMultiply() {
        assertEquals(20, calculator.multiply());
    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.divide());
    }
}
