import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexNumber = scanner.nextLine();

        // Convert hexadecimal to decimal
        long decimalNumber = Long.parseLong(hexNumber, 16);

        // Convert decimal to binary
        String binaryNumber = Long.toBinaryString(decimalNumber);

        System.out.println("Binary number: " + binaryNumber);
    }
}
