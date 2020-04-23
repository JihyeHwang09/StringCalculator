public class StringCalculator {
    public int add(String text) {
        // if - else if - else 형태를 사용하지 않고 if만을 이용해서 구현
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] values = text.split(",");
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
