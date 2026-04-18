interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "Not First Division";
    }
}

public class Practical27 {
    public static void main(String[] args) {
        Result result = new Result();
        System.out.println(result.getDivision(75));
        System.out.println(result.getDivision(45));
    }
}