import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setup() {
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add() {
        Calculator cal = new Calculator();
        assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        Calculator cal = new Calculator();
        assertEquals(3, cal.subtract(6, 3));
        System.out.println("subtract");
    }

    @Test
    public void multiply() {
        Calculator cal = new Calculator();
        assertEquals(18, cal.multiply(6, 3));
        System.out.println("multiply");
    }

    @Test
    public void divide() {
        Calculator cal = new Calculator();
        assertEquals(2, cal.divide(6, 3));
        System.out.println("divide");
    }

    @After
    public void teardown() {
        System.out.println("teardown");
    }
}