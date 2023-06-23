import java.util.Scanner;

public class Dec2bin {
    public static void main(String args[]) {
        int i = 0;
        int dNum;
        int[] bArr = new int[20];

        System.out.print("Enter Decimal No.: ");
        dNum = new Scanner(System.in).nextInt();

        if (dNum == 0) {
            System.out.print("Binary string is 0");
            System.exit(0);
        }

        while (dNum > 0) {
            bArr[i] = dNum % 2;
            dNum = dNum / 2;
            i++;
        }

        System.out.print("Binary string is ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bArr[j]);
        }
    }
}
