import java.util.Scanner;

public class Dec2Hex {
    public static void main(String args[]) {
        int decimalNumber;
        int remainder;
        int quotient;
        int i = 1;
        int j;
        int temp;
        char hexadecimalNumber[] = new char[100];

        System.out.print("Enter Decimal Number: ");
        decimalNumber = new Scanner(System.in).nextInt();

        quotient = decimalNumber;

        while (quotient != 0) {
            temp = quotient % 16;

            // Convert integer into character
            if (temp < 10) {
                temp = temp + 48;
            } else {
                temp = temp + 55;
            }

            hexadecimalNumber[i++] = (char) temp;
            quotient = quotient / 16;
        }

        System.out.print("Hexadecimal value is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(hexadecimalNumber[j]);
        }
    }
}
