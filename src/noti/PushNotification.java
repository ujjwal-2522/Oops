package noti;

public class PushNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Sending push Notification");
    }
}
