import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Odd/Even Checker");
        System.out.println("2. Factorial Summation");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                OddEvenChecker oddEvenChecker = new OddEvenChecker(number);
                oddEvenChecker.checkOddEven();
                break;

            case 2:
                System.out.print("Enter the number of terms in the series: ");
                int n = scanner.nextInt();
                FactorialSumCalculator factorialSumCalculator = new FactorialSumCalculator(n);
                factorialSumCalculator.calculateFactorialSum();
                break;

            default:
                System.out.println("Invalid choice. Please choose either 1 or 2.");
        }
        scanner.close();
    }
}

class OddEvenChecker {
    private int number;
    public OddEvenChecker(int number) {
        this.number = number;
    }
    public void checkOddEven() {
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
        }
    }
}

class FactorialSumCalculator {
    private int n;
    public FactorialSumCalculator(int n) {
        this.n = n;
    }
    public void calculateFactorialSum() {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += factorial(i);
            }
        }
        System.out.println("Sum of the factorial of odd numbers series: " + sum);
    }
    private long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
