import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter salary: ");
                double sal = sc.nextDouble();
                if (sal > 0) {
                    salaries[i] = sal;
                    break;
                } else {
                    System.out.println("Invalid salary! Please enter a positive number.");
                }
            }
            while (true) {
                System.out.print("Enter years of service: ");
                double years = sc.nextDouble();
                if (years >= 0) {
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid years of service! Please enter 0 or more.");
                }
            }
        }
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salaries[i] * 0.05;
            } else {
                bonus[i] = salaries[i] * 0.02;
            }
            newSalary[i] = salaries[i] + bonus[i];

            totalOldSalary += salaries[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    i + 1, salaries[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
