import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number below 100 :");
        int n=sc.nextInt();
        if(n>0&&n<100){
            System.out.println("Number is Positive and Less then 100: ");
        }
        for(int i=100;i>0;i--){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
