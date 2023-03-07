// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

public class task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        StringBuilder sb1 = new StringBuilder("Сумма двух чисел = ");
        sb1.append(c);
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("Разность двух чисел = ");
        sb2.append(d);
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder("Произведение двух чисел = ");
        sb3.append(e);
        System.out.println(sb3);
    }
}
