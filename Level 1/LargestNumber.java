import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if(number1>number2&&number1>number3){
            System.out.println("Is the first number the largest? YES");
        }
        else if(number2>number1&&number2>number3){
            System.out.println("Is the second number the largest? YES");
        }
        else{
            System.out.println("Is the third number the largest? YES");
        }
    }
}
