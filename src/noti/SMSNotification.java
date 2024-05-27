package noti;

public class SMSNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Sending SMS to the user");
    }
}
