public class StringCalculator {
    /*
    극단적으로 리팩토링을 진행한 이유?
    소스코드를 읽을 때 이 메서드가 무슨 일을 하는 메서드인지
    최대한 쉽게 파악할 수 있도록 하기 위함이다.

    세부 구현은 모두 private 메서드로 분리해 일단 관심사에서 제외하고
    add() 메서드가 무슨 일을 한느지에 대한 전체 흐름을 쉽게 파악할 수 있도록
    하기 위함이다.

    세부 구현에 집중하도록 하지 않고,
    논리적인 로직을 쉽게 파악할 수 있도록 구현하는 것이 읽기 좋은 코드이다.
     */


//    add 메서드가 하는 일
    public int add(String text) {
//    1. text값이 비어있으면 0을 반환한다.
        if (isBlank(text)) {
            return 0;
        }
//    2. 비어 있지 않으면
//    2-1)구분자로 분리한다.
//    2-2)숫자로 변환한 다음
//    2-3)이 숫자의 합을 구한다.
        return sum(toInts(split(text)));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private String[] split(String text) {
        return text.split(",");
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
