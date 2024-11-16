import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "manul.txt";
        String destinationFile = "PalasCat.txt";

        try {
            copyFile(sourceFile, destinationFile);
            System.out.println("Копирование завершено успешно.");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void copyFile(String source, String destination) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
        FileWriter writer = new FileWriter(destination)) {

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line); 
                writer.write(System.lineSeparator());
            }
        }
        
    }
}