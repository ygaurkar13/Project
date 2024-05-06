public class Decimal_To_Hexadecimal {
    public static void main(String[] args) {
        int decimalNumber = 255;
        String hexadecimalNumber = decimalToHexadecimal(decimalNumber);
        System.out.println(decimalNumber + " = Hexadecimal: " + hexadecimalNumber);
    }

    public static String decimalToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber);
    }
}

