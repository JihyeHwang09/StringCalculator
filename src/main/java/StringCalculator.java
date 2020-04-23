public class StringCalculator {
    public int add(String text) {
        // if - else if - else 형태를 사용하지 않고 if만을 이용해서 구현
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] values = text.split(",");
        return sum(toInts(values));
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

/*
각 메서드가 하나의 책임만 가지고 있는가?
새로 분리한 sum() 메서드는 어떤가?
-> 문자 배열을 숫자로 변환하는 작업과
숫자 배열의 합을 구하는 두 가지 일을 하고 있음을 알 수 있다.
 */
