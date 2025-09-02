import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status = Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status = Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status = Overweight");
        } else {
            System.out.println("Weight Status = Obese");
        }
    }
}
