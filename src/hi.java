import noti.Notification;
import noti.NotificationFactory;
import java.util.logging.*;

public class hi {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
    NotificationFactory notificationFactory= new NotificationFactory();
    Notification Hi=notificationFactory.createNotification("SMS");
    Hi.notifyuser();
        long end=System.currentTimeMillis();
        System.out.println("Time Difference "+ (end-start));
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
