import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int GreatestFact=1;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                GreatestFact=i;
                break;
            }
        }
        System.out.println(GreatestFact);
    }
}
