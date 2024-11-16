import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");

        try {
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Ваш возраст: " + age);
        } catch (CustomAgeException e) {
            ExceptionLogger.logException(e);
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            ExceptionLogger.logException(e);
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) throws CustomAgeException {
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Недопустимый возраст: " + age);
        }
    }
}
