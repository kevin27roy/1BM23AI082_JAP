import java.util.Scanner;
class Student {
    int marks;
}
public class records082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;
        Student[] obj = new Student[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            obj[i].marks = scanner.nextInt();
            System.out.println("Student " + (i + 1) + " Marks is: " + obj[i].marks);
        }
        int highestscore = obj[0].marks;
        int totscore = 0;
        for (int i = 0; i < n; i++) {
            totscore += obj[i].marks;
            if (obj[i].marks > highestscore) {
                highestscore = obj[i].marks;
            }
        }
        System.out.println("Statistics:");
        System.out.println("Highest score: " + highestscore);
        System.out.println("Total score: " + totscore);
    }
}
