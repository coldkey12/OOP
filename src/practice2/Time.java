package practice2;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        }
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getUniversalTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String getStandardTime() {
        String period = (hours >= 12) ? "PM" : "AM";
        int standardHours = hours % 12;
        if (standardHours == 0) {
            standardHours = 12;
        }
        return String.format("%02d:%02d:%02d %s", standardHours, minutes, seconds, period);
    }

    public void add(Time time) {
        this.hours = (this.hours + time.hours) % 24;
        this.minutes = (this.minutes + time.minutes) % 60;
        this.seconds = (this.seconds + time.seconds) % 60;
    }
}
