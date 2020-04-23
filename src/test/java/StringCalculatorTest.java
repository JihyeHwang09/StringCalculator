import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    private StringCalculator cal;

    @Before
    public void setup() {
        cal = new StringCalculator();
    }

    // 빈 문자열 또는 null값을 입력할 경우 0을 반환해야 한다.
    @Test
    public void add_null_또는_빈문자() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));

    }

    // 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
    @Test
    public void add_숫자하나() throws  Exception {
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception {
        assertEquals(3, cal.add("1, 2"));
    }
}
