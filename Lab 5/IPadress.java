import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPadress {
    public static void main(String[] args) {
        String IP1 = "192.168.0.1";
        String IP2 = "500.168.0.1";
        String IP3 = "0w0.0w0.0.0";

        try {
            ipVer(IP1);
            ipVer(IP2);
            ipVer(IP3);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void ipVer(String IP) {
        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher matcher = pattern.matcher(IP);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Корректный адрес");
            found = true;
        }
         if (!found) {
            System.out.println("Некорректный адрес");
        }
    }
}
