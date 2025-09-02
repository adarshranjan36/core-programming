import java.util.Scanner;

public class Remarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int phyMarks=sc.nextInt();
        int cheMarks=sc.nextInt();
        int MathsMarks=sc.nextInt();
        int totalMarks=phyMarks+cheMarks+MathsMarks;
        int percentage=(totalMarks*100)/300;
        int average=totalMarks/3;
        System.out.println("Total = "+totalMarks);
        System.out.println("Percentage = "+percentage);
        System.out.println("Average = "+average);
        if(percentage>=80){
            System.out.println("Grade = A");
            System.out.println("Remark = Level 4, above agency-normalised standards");
        }
        else if(percentage>=70&&percentage<80){
            System.out.println("Grade = B");
            System.out.println("Remark = Level 3, at agency-normalized standards");
        }
        else if(percentage>=60&&percentage<70){
            System.out.println("Grade = C");
            System.out.println("Remark = Level 2, below, but approaching agency-normalized standards");
        }
        else if(percentage>=50&&percentage<60){
            System.out.println("Grade = D");
            System.out.println("Remark = Level 1, well below agency-normalized standards");
        }
        else if(percentage>=40&&percentage<50){
            System.out.println("Grade = E");
            System.out.println("Remark = Level 1-, too below agency-normalized standards");
        }
        else if(percentage<40){
            System.out.println("Grade = R");
            System.out.println("Remark = Remedial Standards");
        }
    }
}
