import java.util.Scanner;

public class factors2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Not Positive! ");
        }
        else{
            int i=1;
            while(i<n){
                if(n%i==0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
