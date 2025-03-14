import java.util.Scanner;

public class SimpleArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int originalNumber = number;
        int result = 0;
        
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }
        
        if (result == number) {
            System.out.println(number + " is not an Armstrong number.");
        } else {
            System.out.println(number + " is an Armstrong number.");
        }
    }
}
