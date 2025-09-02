import java.util.Scanner;

public class employees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int year=sc.nextInt();
        if(year>5){
            int bonus=salary/20;
            System.out.println(bonus);
        }
        
    }
}
