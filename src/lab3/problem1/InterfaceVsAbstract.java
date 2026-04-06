package lab3.problem1;

interface Printable {
    void print();
}

interface Saveable {
    void save(String path);
}

class Report implements Printable, Saveable {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing report: " + title);
        System.out.println(content);
    }

    @Override
    public void save(String path) {
        System.out.println("Saving report '" + title + "' to " + path);
    }
}

class Image implements Printable, Saveable {
    private String filename;
    private int width, height;

    public Image(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Printing image: " + filename + " (" + width + "x" + height + ")");
    }

    @Override
    public void save(String path) {
        System.out.println("Saving image '" + filename + "' to " + path);
    }
}


abstract class Notification {
    protected String recipient;
    protected String message;
    protected boolean sent;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
        this.sent = false;
    }

    public void markAsSent() {
        this.sent = true;
        System.out.println("Notification to " + recipient + " marked as sent.");
    }

    public boolean isSent() {
        return sent;
    }

    public abstract void send();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " to " + recipient + " [" + (sent ? "sent" : "pending") + "]";
    }
}

class EmailNotification extends Notification {
    private String subject;

    public EmailNotification(String recipient, String subject, String message) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("Sending email to " + recipient + ": [" + subject + "] " + message);
        markAsSent();
    }
}

class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification(String recipient, String phoneNumber, String message) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + phoneNumber + " (" + recipient + "): " + message);
        markAsSent();
    }
}

class PushNotification extends Notification {
    private String deviceId;

    public PushNotification(String recipient, String deviceId, String message) {
        super(recipient, message);
        this.deviceId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("Pushing to device " + deviceId + " (" + recipient + "): " + message);
        markAsSent();
    }
}


interface Loggable {
    void log();
}

class LoggableEmailNotification extends EmailNotification implements Loggable {
    public LoggableEmailNotification(String recipient, String subject, String message) {
        super(recipient, subject, message);
    }

    @Override
    public void log() {
        System.out.println("[LOG] " + this);
    }
}


public class InterfaceVsAbstract {
    public static void main(String[] args) {
        System.out.println("=== Interface Example: Unrelated classes sharing capabilities ===");
        Printable[] printables = {
            new Report("Q1 Sales", "Revenue: $1M"),
            new Image("logo.png", 1920, 1080)
        };
        for (Printable p : printables) {
            p.print();
        }

        System.out.println("\n=== Abstract Class Example: Related classes sharing state and behavior ===");
        Notification[] notifications = {
            new EmailNotification("alice@mail.com", "Meeting", "Meeting at 3 PM"),
            new SMSNotification("Bob", "+1234567890", "Your order shipped"),
            new PushNotification("Charlie", "device-xyz", "New message received")
        };
        for (Notification n : notifications) {
            n.send();
            System.out.println(n);
        }

        System.out.println("\n=== Combined: Abstract class + Interface ===");
        LoggableEmailNotification logEmail = new LoggableEmailNotification(
            "dave@mail.com", "Alert", "Server is down!"
        );
        logEmail.send();
        logEmail.log();

    }
}
