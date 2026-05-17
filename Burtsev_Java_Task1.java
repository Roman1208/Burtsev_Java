import java.util.Scanner;
import java.util.InputMismatchException;

public class Burtsev_Java_Task1 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        System.out.print("Введите число a: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число ");
                scanner.nextLine();
                System.out.print("Введите число a: ");
            }
        }
        System.out.print("Введите число b: ");
        while (true) {
            try {
                b = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число ");
                scanner.nextLine();
                System.out.print("Введите число b: ");
            }
        }

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println();
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Делеть на 0 нельзя"); //деление на ноль
        }
    }
}