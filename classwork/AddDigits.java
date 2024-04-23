import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String varStringValue = scanner.next();
        int result = 0;

        for (int i = 0; i < varStringValue.length(); i++) {
            result += Character.getNumericValue(varStringValue.charAt(i));
        }

        System.out.println(result);
    }
}
