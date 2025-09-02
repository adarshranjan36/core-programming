import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Number of digits = 1");
            return;
        }
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Number of digits = " + count);
    }
}

