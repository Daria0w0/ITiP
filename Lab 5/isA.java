import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isA {
    public static void main(String[] args) {
        String text1 = "The quick brown fox jumps over the lazy dog";
        String text2 = "Apple and orange";
        String let = "a";
        char letter = let.charAt(0);
        try {
            findWordsStartingWith(text1, letter);
            findWordsStartingWith(text2, letter);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void findWordsStartingWith(String text, char letter) {
        Pattern pattern = Pattern.compile("\\b" + letter + "\\w*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        System.out.println("Найденные слова:");
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println("Слов начинающихся с буквы '" + letter + "' не найдено");
        }
    }
}