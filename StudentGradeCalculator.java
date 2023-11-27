package G1;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No.of Subjects :");
        int N= sc.nextInt();
        int arr[]=new int[N];
        int totalMarks=0;
        for(int i=0;i<N;i++) {
            System.out.print("Enter the Marks Of Subject " +(i+1)+" :");
            arr[i] = sc.nextInt();
            totalMarks += arr[i];
        }
        double avg_per=(double)totalMarks/(N*100)*100;
        System.out.println("Your Result:");
        System.out.println("TotalMarks :"+totalMarks);
        System.out.println("Average Percentage :"+avg_per+"%");
        String studentgrade=calculategrade(avg_per);
        System.out.println("Your Grade: "+studentgrade);
    }
    public static String calculategrade(double per) {
        if (per > 90)
            return "O";
        else if (per > 80)
            return "A+";
        else if (per > 70)
            return "A";
        else if (per > 60)
            return "B+";
        else if (per > 50)
            return "B";
        else if (per > 40)
            return "C";
        else
            return "F";
    }
}
