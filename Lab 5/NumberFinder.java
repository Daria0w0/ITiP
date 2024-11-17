import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price of the product is $19.99";

        try {
            findNumbers(text);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
    
    public static void findNumbers(String text) {
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

         if (!found) {
            System.out.println("Чисел нет");
        }
    }
}
