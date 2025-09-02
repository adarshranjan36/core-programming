import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=sc.nextInt();
        while(counter>=1){
            System.out.print(counter+" ");
            counter--;
        }
    }
}
