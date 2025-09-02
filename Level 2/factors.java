import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Not Positive! ");
        }
        else{
            for(int i=1;i<n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
