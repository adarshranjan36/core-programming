import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0.0;          
        int index = 0;           
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index < 10) {
                numbers[index] = num;
                index++;
            } else {
                System.out.println("Array is full (10 numbers only).");
                break;
            }
        }
        for (int i = 0; i < index; i++) {
            sum+=numbers[i];
        }
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\nSum of numbers: "+sum);
    }
}
