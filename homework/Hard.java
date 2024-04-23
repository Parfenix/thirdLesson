public class Hard {
    // В интервале от 0 до 50_000 вывести только четные числа

    public static void main(String[] args) {
        for (int i = 0; i <= 50000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
