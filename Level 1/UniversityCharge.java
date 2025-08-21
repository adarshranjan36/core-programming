public class UniversityCharge {
    public static void main(String[] args) {
        int fees=125000;
        int disPer=10;
        double discount=(fees*disPer)/100.0;
        double discountedtedFee=fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedtedFee);
    }
}
