package noti;

public class EmailNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Sending Email to the User");
    }
}
