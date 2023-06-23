import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        String hex;
        int decimal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        hex = scanner.nextLine();

        decimal = Integer.parseInt(hex, 16);

        System.out.println("Decimal number: " + decimal);
    }
}
