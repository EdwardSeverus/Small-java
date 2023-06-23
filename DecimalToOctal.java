import java.util.Scanner;

public class Dec2Oct {
    public static void main(String args[]) {
        int decimal;
        int remainder;
        int octal = 0;
        int i = 1;

        System.out.print("Enter a decimal number: ");
        decimal = new Scanner(System.in).nextInt();

        while (decimal != 0) {
            remainder = decimal % 8;
            octal = octal + (remainder * i);
            decimal = decimal / 8;
            i = i * 10;
        }

        System.out.print("Octal number: " + octal);
    }
}
