import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AaAaA {
    public static void main(String[] args) {
        String text1 = "The quick brown fox jumps over the lazy dog";
        String text2 = "FloppaIsABigRussianCat";
        String text3 = "aaaAAaaaAaAaaaAAAAaaA";
        try {
            String result1 = searchLowUpper(text1);
            String result2 = searchLowUpper(text2);
            String result3 = searchLowUpper(text3);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
        } catch (Exception e) {
            System.out.println("Найдена ошибка: " + e.getMessage());
        } 
    }

    public static String searchLowUpper(String text) {
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("!$1$2!");

        if (result.equals(text)) {
            return "Таких мест нет";
        } else {
            return result;
        }
    }
}