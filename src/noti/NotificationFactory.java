package noti;

public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel==null || channel.isEmpty()){
            return null;
        }
        switch (channel){
            case "SMS":
                return new SMSNotification();
            case "E-Mail":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " +channel);
        }
    }
}
