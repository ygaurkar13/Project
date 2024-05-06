public class Decimal_To_Octal {
    public static void main(String[] args) {
        int decimalNumber = 123;
        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println(decimalNumber + " = Octal :" + octalNumber);
    }

    public static String decimalToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}

