import java.util.*;
public class HeightConverts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double heightcm=sc.nextDouble();
        double totalInches=heightcm/2.54;
        int foot=(int)(totalInches/12);
        double inches=totalInches%12;
        System.out.println("Your Height in cm is "+heightcm+" while in feet is "+foot+" and inches is "+inches);

    }
}
