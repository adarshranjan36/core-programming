import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        double sum=0.0;
        while(num!=0){
            sum+=num;
            System.out.println("Enter Number Again as The Given Number Was Not Zero:");
            num=sc.nextDouble();
        }
        System.out.println("Total = "+sum);
    }
}
