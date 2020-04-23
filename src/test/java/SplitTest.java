import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
// 숫자가 하나인 경우와 쉼표 구분자를 포함하는 경우를 따로 분기해서 처리하는 문제
// -> String의 split() 메서드에 숫자 하나를 가지는 문자열을 전달하면,
// 숫자 하나가 담겨 있는 String[]을 반환하면 이 부분의 분기문을 제거할 수 있다.
public class SplitTest {
    @Test
    public void split() {
        assertArrayEquals(new String[] {"1"}, "1".split(","));
        assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
    }
}
