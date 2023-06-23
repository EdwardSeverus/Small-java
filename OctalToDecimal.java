import java.util.Scanner;

public class Oct2Dec {
    public static void main(String args[]) {
        int octal;
        int decimal = 0;
        int power = 0;

        System.out.print("Enter an octal number: ");
        octal = new Scanner(System.in).nextInt();

        while (octal != 0) {
            int digit = octal % 10;
            decimal += digit * Math.pow(8, power);
            power++;
            octal /= 10;
        }

        System.out.print("Decimal number: " + decimal);
    }
}
