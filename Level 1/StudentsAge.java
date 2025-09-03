import java.util.Scanner;

public class StudentsAge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        System.out.println("Enter Age :");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]>=18){
                System.out.println("The student with the age of "+age[i]+" can vote");
            }
            else{
                System.out.println("The student with the age of "+age[i]+" can't vote");
            }
        }
    }
}
