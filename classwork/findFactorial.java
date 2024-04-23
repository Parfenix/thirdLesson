import java.util.Scanner;

public class findFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int varIntCurrentNumber = scanner.nextInt();

        int i = 1;
        int result = 1;

        while (i <= varIntCurrentNumber) {
            result *= i;
            ++i;
        }

        System.out.println(result);

        scanner.close();
    }
}
