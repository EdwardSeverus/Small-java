import java.util.Scanner;

public class Oct2Bin {
    public static void main(String args[]) {
        int octal;
        int decimal = 0;
        int binary = 0;
        int i = 0;

        System.out.print("Enter an octal number: ");
        octal = new Scanner(System.in).nextInt();

        // Convert octal to decimal
        while (octal != 0) {
            decimal += (octal % 10) * Math.pow(8, i);
            octal /= 10;
            i++;
        }

        // Convert decimal to binary
        i = 1;
        while (decimal != 0) {
            binary += (decimal % 2) * i;
            decimal /= 2;
            i *= 10;
        }

        System.out.print("Binary number: " + binary);
    }
}
