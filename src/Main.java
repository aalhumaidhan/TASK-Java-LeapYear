import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "This year is a leap year." : "This year is not a leap year.";
        System.out.println(result);
        scanner.close();
    }
}