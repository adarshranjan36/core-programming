import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers= new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                System.out.println("Nmber is Zero");
            }
            else if(numbers[i]<0){
                System.out.println("Number is Negative");
            }
            else{
                if(numbers[i]%2==0){
                    System.out.println("Number is Positive and Even");
                }
                else{
                    System.out.println("Number is Positive and Odd");
                }
            }
        }
        if(numbers[0]==numbers.length-1){
            System.out.println("They Are Equal");
        }
        else if(numbers[0]>numbers.length-1){
            System.out.println("First is Greater");
        }
        else{
            System.out.println("Last is Greater");
        }
    }
}
