import java.util.Scanner;

public class YoungestFriends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amarAge=sc.nextInt();
        int amarHeight=sc.nextInt();
        int akbarAge=sc.nextInt();
        int akbarHeight=sc.nextInt();
        int anthonyAge=sc.nextInt();
        int anthonyHeight=sc.nextInt();
        if(amarAge<akbarAge&&amarAge<anthonyAge){
            System.out.println("Amar is Youngest and having age = "+amarAge);
        }
        else if(akbarAge<amarAge&&akbarAge<anthonyAge){
            System.out.println("Akbar is Youngest and having age = "+akbarAge);
        }
        else{
            System.out.println("Anthony is Youngest and having age = "+anthonyAge);
        }
        if(amarHeight>akbarHeight&&amarHeight>anthonyHeight){
            System.out.println("Amar is Tallest and having height = "+amarHeight);
        }
        if(akbarHeight>amarHeight&&akbarHeight>anthonyHeight){
            System.out.println("Akbar is Tallest and having height = "+akbarHeight);
        }
        else{
            System.out.println("Anthony is Tallest and having height = "+anthonyHeight);
        }
    }
}
