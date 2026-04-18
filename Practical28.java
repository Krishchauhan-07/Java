interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 75) {
            return "First Division";
        } else if (average >= 60) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Practical28 {
    public static void main(String[] args) {
        Result result = new Result();

        int mark1 = 85;
        int mark2 = 35;
        double average1 = 78.5;
        double average2 = 55.0;
        double average3 = 38.0;

        System.out.println("Mark: " + mark1 + " -> Passed: " + result.isPassed(mark1));
        System.out.println("Mark: " + mark2 + " -> Passed: " + result.isPassed(mark2));

        System.out.println("Average: " + average1 + " -> Division: " + result.getDivision(average1));
        System.out.println("Average: " + average2 + " -> Division: " + result.getDivision(average2));
        System.out.println("Average: " + average3 + " -> Division: " + result.getDivision(average3));
    }
}