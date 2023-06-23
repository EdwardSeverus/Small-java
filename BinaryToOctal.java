import java.util.Scanner;

public class Bin2Oct {
    public static void main(String[] args) {
        int binary, remainder, decimal = 0;
        int octal = 0;
        int i = 1;
        
        System.out.print("Enter a binary number: ");
        binary = new Scanner(System.in).nextInt();
        
        // Convert Binary to Decimal number first
        while (binary != 0) {
            remainder = binary % 10;
            decimal = decimal + (remainder * i);
            binary = binary / 10;
            i = i * 2;
        }
        
        // Then convert decimal to octal number
        i = 1;
        while (decimal != 0) {
            remainder = decimal % 8;
            octal = octal + (remainder * i);
            decimal = decimal / 8;
            i = i * 10;
        }
        
        System.out.println("Octal number: " + octal);
    }
}
