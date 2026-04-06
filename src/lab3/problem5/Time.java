package lab3.problem5;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {}

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23)
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        if (minutes < 0 || minutes > 59)
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        if (seconds < 0 || seconds > 59)
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
