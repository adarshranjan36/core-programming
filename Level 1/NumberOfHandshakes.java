import java.util.*;
public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=sc.nextInt();
        int n=numberOfStudents;
        int Handshakes=(n*(n-1))/2;
        System.out.println("the number of possible handshakes are "+Handshakes);
    }
}
