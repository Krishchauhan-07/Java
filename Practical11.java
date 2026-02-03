class Time {
    int hours;
    int minutes;
    public void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    public void displayTime() {
        System.out.printf("%d:%02d%n", hours, minutes);
    }

    // Method to add two Time objects and store result in the calling object
    public void addTime(Time t1, Time t2) {
        // 1. Add minutes first
        int totalMinutes = t1.minutes + t2.minutes;
        
        // 2. Calculate carried over hours (if minutes >= 60)
        int extraHours = totalMinutes / 60;
        
        // 3. Store the remaining minutes in the calling object
        this.minutes = totalMinutes % 60;
        
        // 4. Add hours plus any extra hours from minutes
        this.hours = t1.hours + t2.hours + extraHours;
    }
}

public class Practical11 {
    public static void main(String[] args) {
        // 1. Create three Time objects
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time(); // This will hold the result

        // 2. Initialize t1 and t2 using setTime
        t1.setTime(2, 45); // 2 hours 45 minutes
        t2.setTime(3, 30); // 3 hours 30 minutes

        // 3. Add t1 and t2, storing result in t3
        t3.addTime(t1, t2);

        // 4. Display results
        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.println("-----------------");
        System.out.print("Total Time: ");
        t3.displayTime();
    }
}