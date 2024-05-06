public class Decimal_To_Binary {
    public static void main(String[] args) {
        int decimalNumber = 10;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println(decimalNumber + " = " + binaryNumber);
    }

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber = decimalNumber / 2;
        }

        return binary.toString();
    }
}

