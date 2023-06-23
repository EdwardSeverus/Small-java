import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary string (0-1): ");
        String binaryString = scanner.nextLine();
        int decimalNumber = bin2dec(binaryString);

        if (decimalNumber == -1) {
            System.out.print("Invalid string.");
        } else {
            System.out.print("Decimal number: " + decimalNumber);
        }
    }

    public static int bin2dec(String binaryString) {
        int decimalNumber = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            int n = binaryString.charAt(i) - '0'; // Convert char '0' or '1' into integer 0 or 1

            // Check for 0 and 1
            if (n != 0 && n != 1) {
                return -1; // Invalid string
            }

            decimalNumber = (decimalNumber * 2) + n;
        }

        return decimalNumber;
    }
}
