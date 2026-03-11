import java.util.Scanner;

public class practical19 {

    String collegeName;

    practical19(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {

        String studentName;
        String course;

        void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name : ");
            studentName = sc.nextLine();
            System.out.print("Enter Course       : ");
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("\n======= Admission Details =======");
            System.out.println("College Name  : " + collegeName);
            System.out.println("Student Name  : " + studentName);
            System.out.println("Course        : " + course);
            System.out.println("=================================");
        }
    }

    public static void main(String[] args) {
        practical19 college = new practical19("Indus University");
        practical19.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
    }
}