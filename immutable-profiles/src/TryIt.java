import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();

        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Before: " + p.getEmail());
        // No setter available, so we can't change the email
        System.out.println("After:  " + p.getEmail());
        System.out.println("=> Now immutable: no setters, safe after construction.");
    }
}