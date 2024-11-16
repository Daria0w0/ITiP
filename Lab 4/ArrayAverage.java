public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            double average = calculateAverage(arr);
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за границы массива.");
        } catch (NumberFormatException e) {
            System.out.println("Оштбка: Неверные данные в массиве.");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            throw new ArithmeticException("Массив пустой, невозможно вычислить среднее.");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}