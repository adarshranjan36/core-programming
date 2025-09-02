import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonths[i];
        }
        if (dayOfYear >= 79 && dayOfYear <= 171) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
