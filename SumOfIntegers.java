import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
                int sum = 0;
        int totalNumbers = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Enter integer " +i+ ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        scanner.close();
        System.out.println("The sum of the integers is: " + sum);
    }
}

