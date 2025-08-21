import java.util.Scanner;

public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distanceInFeet=sc.nextInt();
        double yard=distanceInFeet/3.0;
        double miles=yard/1760.0;
        System.out.println("the distance in yards and miles are "+yard+" and "+miles);
    }
}
