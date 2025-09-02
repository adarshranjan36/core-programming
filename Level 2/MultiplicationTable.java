import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number btw (6to9) ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int table=i*n;
            System.out.println(n+" X "+i+" = "+table);
        }
    }
}
