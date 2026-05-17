import java.util.Scanner;

public class Burtsev_Java_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку a: ");
        String a = scanner.nextLine();

        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();

        scanner.close();

        if (a.equals(b)) {
            System.out.print("Строки идентичны ");
        } else {
            System.out.print("Строки неидентичны ");
        }
    }
}