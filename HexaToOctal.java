import java.util.Scanner;

public class Hex2Oct {
    public static void main(String[] args) {
        String hexNumber;
        int decimalNumber;

        System.out.print("Enter a hexadecimal number: ");
        hexNumber = new Scanner(System.in).nextLine();

        // Convert hexadecimal to decimal
        decimalNumber = Integer.parseInt(hexNumber, 16);

        // Convert decimal to octal
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Octal number: " + octalNumber);
    }
}
