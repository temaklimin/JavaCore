
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the numbers in row");

        String[] numbers = new String[0];
        if (scanner.hasNext()) {
            numbers = scanner.nextLine().split("\\s+");
        }
        shortAndLongValues(numbers);
        ascendingSort(numbers);
    }

    public static void shortAndLongValues(String[] numbers) {
        String min = numbers[0];
        String max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min.length() > numbers[i].length()) {
                min = String.valueOf(numbers[i]);
            } else if (max.length() < numbers[i].length()) {
                max = String.valueOf(numbers[i]);
            }
        }
        System.out.println(String.format("Long number %s. The length of the number is %s", max, max.length()));
        System.out.println(String.format("Short number %s. The length of the number is %s", min, min.length()));

    }

    public static void ascendingSort(String[] array){
        for(int i = 1; i < array.length; i++) {
            String current = array[i];
            int j;
            for(j = i - 1; j >= 0 && array[j].length() > current.length(); j--)
                array[j+1] = array[j];
                array[j+1] = current;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}


