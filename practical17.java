public class practical17 {

    static String universityName;
    static int totalStudents = 0;

    static {
        universityName = "Gujarat Technological University";
        System.out.println("Static Block Executed: University Name set to -> " + universityName);
    }

    {
        totalStudents++;
        System.out.println("Instance Block Executed: New Student Object Created. Total Students so far: " + totalStudents);
    }

    String studentName;

    practical17(String studentName) {
        this.studentName = studentName;
        System.out.println("Constructor Executed: Student \"" + studentName + "\" enrolled.");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        System.out.println("\n--- Creating Student 1 ---");
        practical17 s1 = new practical17("Aakash Mehta");

        System.out.println("\n--- Creating Student 2 ---");
        practical17 s2 = new practical17("Bhavna Shah");

        System.out.println("\n--- Creating Student 3 ---");
        practical17 s3 = new practical17("Chirag Patel");

        System.out.println("\n--- Summary ---");
        System.out.println("University: " + universityName);
        System.out.println("Total Students Enrolled: " + getTotalStudents());
    }
}