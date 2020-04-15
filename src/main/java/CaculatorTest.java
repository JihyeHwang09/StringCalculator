public class CaculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        add(cal);
        substract(cal);
        multiply(cal);
        divide(cal);
    }

    private static void divide(Calculator cal) {
        System.out.println(cal.divide(9, 3));
    }

    private static void multiply(Calculator cal) {
        System.out.println(cal.multiply(9, 3));
    }

    private static void substract(Calculator cal) {
        System.out.println(cal.subtract(9, 3));
    }

    private static void add(Calculator cal) {
        System.out.println(cal.add(9, 3));
    }
}
