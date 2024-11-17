import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");

        try {
            String password = scanner.nextLine();
            passwordVer(password);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void passwordVer(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}");
        Matcher matcher = pattern.matcher(password);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Корректный пароль");
            found = true;
        }

        if (!found) {
            System.out.println("Некорректный пароль");
        }
    }
}
