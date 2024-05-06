public class AbsoluteValue {
    public static void main(String[] args) {
        int number = -5;
        int absValue = absolute(number);
        System.out.println(number + " = " + absValue);
    }

    public static int absolute(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }
}

