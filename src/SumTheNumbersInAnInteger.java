import java.util.Scanner;

public class SumTheNumbersInAnInteger {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = scanner.nextInt();
        System.out.println("Sum the numbers in an integer is: " + sumDigits(number));
    }

   public static int sumDigits(int number) {
       int sum = number % 10;

       while (number / 10 != 0) {
           number = number / 10;
           sum += (number % 10);
       }

       return sum;
   }
}
