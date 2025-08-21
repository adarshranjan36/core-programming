import java.util.Scanner;

public class UniversityCharge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int disPer=sc.nextInt();
        double discount=(fee*disPer)/100.0;
        double discountedFee=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFee);
    }
}
