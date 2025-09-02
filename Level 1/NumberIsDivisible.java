import java.util.Scanner;

public class NumberIsDivisible{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            if(n%5==0){
                System.out.println("Is the number "+n+" divisible by 5? YES");
            }
            else{
                System.out.println("Not Divisible");
            }
        }
    }
}
