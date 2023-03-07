// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class task1 {

    static String str1 = "Добро пожаловать";
    static String str2 = "Добро";

    public static void main (String[] args) {
        System.out.println(str1.contains(str2));
        System.out.println();
    }

    public static boolean reverseStr(String str1, String str2) {
        reverseStr(str1, new StringBuilder(str2).reverse().toString());
        return true;
    }
}
