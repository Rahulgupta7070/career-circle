import java.util.Scanner;
public class printGrade_UsingIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter youtr marks: ");
        double a = sc.nextDouble();
        marksAndGrade(a);
        sc.close();
    }
    public static void marksAndGrade(double marks) {
        if(marks>=90 && marks<=100) {
            System.out.print("Grade A");
        }
        else if(marks>=80 && marks<=89) {
            System.out.print("Grade B");
        }
        else if(marks>=70 && marks<=79) {
            System.out.print("Grade C");
        }
        else if(marks>=60 && marks<=69) {
            System.out.print("Grade D");
        }
        else if(marks<60 && marks>=0){
            System.out.print("Fail");
        }
        else {
            System.out.print("Invalid marks");
        }
    }
}
