import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator cal = new Calculator();
        System.out.println(cal.add(9, 3));
    }

    @Test
    void subtract() {
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(9, 3));
    }

    @Test
    void multiply() {
        Calculator cal = new Calculator();
        System.out.println(cal.multiply(9, 3));
    }

    @Test
    void divide() {
        Calculator cal = new Calculator();
        System.out.println(cal.divide(9, 3));
    }
}