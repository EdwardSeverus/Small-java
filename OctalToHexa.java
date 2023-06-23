import java.util.Scanner;

public class Oct2Hex {
    public static void main(String args[]) {
        String octal;
        int decimal;
        String hexadecimal;

        System.out.print("Enter an octal number: ");
        octal = new Scanner(System.in).next();

        decimal = Integer.parseInt(octal, 8); // Convert octal to decimal
        hexadecimal = Integer.toHexString(decimal); // Convert decimal to hexadecimal

        System.out.print("Hexadecimal number: " + hexadecimal);
    }
}
