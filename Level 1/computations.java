import java.util.Scanner;

public class computations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Number is Not Natural");
        }
    
        int formulaSum=num*(num+1)/2;
        System.out.println(formulaSum);
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            i++;
            
        }
        System.out.println(sum);
        if(formulaSum==sum){
            System.out.println("computations was correct.");
        }
        else{
            System.out.println("computations wasn't correct.");
        }
    }
}
