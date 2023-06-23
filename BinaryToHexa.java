import java.util.Scanner;

public class Bin2hex {

    public static void main(String[] args) {
        int[] hexadecimal = new int[1000];
        int dec = 0;
        int binary;
        int i = 1;
        int j;

        int rem;

        System.out.print("Enter a Binary Number: ");
        binary = new Scanner(System.in).nextInt();

        // Binary to decimal
        while (binary > 0) {
            rem = binary % 10;
            dec = dec + (rem * (int) Math.pow(2, i));
            binary = binary / 10;
            i++;
        }

        // Decimal to hexadecimal
        i = 0;
        while (dec != 0) {
            hexadecimal[i] = dec % 16;
            dec = dec / 16;
            i++;
        }

        System.out.print("Hexadecimal value: ");
        for (j = i - 1; j >= 0; j--) {
            if (hexadecimal[j] > 9) {
                System.out.print((char) (hexadecimal[j] + 55));
            } else {
                System.out.print(hexadecimal[j]);
            }
        }
    }
}
