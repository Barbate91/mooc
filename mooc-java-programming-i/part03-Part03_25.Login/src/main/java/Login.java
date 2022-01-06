
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();
        map.put("alex","sunshine");
        map.put("emma","haskell");

        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Enter password:");
        String pwd = scanner.nextLine();

        String userPwd = map.get(user);
        if (userPwd != null && userPwd.equals(pwd)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
