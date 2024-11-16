import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExceptionLogger {
    private static final String LOG_FILE = "C:\\Users\\manul\\Desktop\\ITiP\\Lab 4\\n" + //
                "3\\log\\exceptions.txt";
    
    public static void logException(Exception e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) { 
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(timestamp + " - " + e.getMessage());
            writer.newLine();
        } catch (IOException ioException) {
            System.out.println("Ошибка при записи в лог-файл: " + ioException.getMessage());
        }
    }
}
