import java.util.Scanner;

public class reverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Invalid");
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;
            int reversed = units * 100 + tens * 10 + hundreds;
            System.out.println("Reversed number: " + reversed);
        }

        scanner.close();
    }
}
