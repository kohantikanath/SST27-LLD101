public class EmailService implements NotificationService {
    @Override
    public void send(String to, String message) {
        new EmailClient().send(to, message);
    }
}
