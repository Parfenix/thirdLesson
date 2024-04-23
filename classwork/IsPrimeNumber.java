import java.util.Scanner;

public class IsPrimeNumber {
    public static String isPrime(int number) {
        int varIntCurrentNumber = number;

        if (varIntCurrentNumber == 1) {
            return "no";
        }

        if (varIntCurrentNumber == 2 || varIntCurrentNumber == 3) {
            return "yes";
        }

        if (varIntCurrentNumber % Math.sqrt(varIntCurrentNumber) == 0) {
           return "no";
        }

        for (int i = 2; i <= Math.sqrt(varIntCurrentNumber); i++) {
            if (varIntCurrentNumber % i == 0) {
                return "no";
            }
        }

        return  "yes";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int varIntCurrentNumber = scanner.nextInt();
        System.out.println(IsPrimeNumber.isPrime(varIntCurrentNumber));
    }

}
