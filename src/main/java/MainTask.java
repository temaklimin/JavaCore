import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        doTask1();
        doTask2(args);
        doTask3();
        doTask4();
        doTask5();
    }

    private  static void startApp(String[] args){

    }

    private static void doTask1() {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Hello %s", scanner.nextLine()));
    }

    private static void doTask2(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Hello " + args[i]);
        }
    }

    private static void doTask3() {
        int a = 0;
        int b = 100;
        for (int i = 0; i < 15; i++) {
            int random_num = a + (int) (Math.random() * b);
            System.out.print(" " + random_num);
        }
        for (int i = 0; i < 15; i++) {
            int random_num = a + (int) (Math.random() * b);
            System.out.println(random_num);
        }
    }

    private static void doTask4() {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x[] = new int[3];
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
            sum = sum + x[i];
        }
        System.out.println("Sum = " + sum);
    }

    private static void doTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer between 1 and 12");
        int number = scanner.nextInt();
        String[] month = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(number > 0 && number < month.length) {
            System.out.println(month[number]);
        } else {
            System.out.println("Month not found");
        }

    }
}
