// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

public class task3 {
    public static void main(String[] args) {
        StringBuilder str3 = new StringBuilder();
        str3.append("2 + 3 = 5");
        System.out.println(str3);
        str3.insert(7, "равно");
        str3.deleteCharAt(6);
        System.out.println(str3);

        StringBuilder str4 = new StringBuilder("5 + 5 = 10");
        System.out.println(str4);
        str4.replace(5, 8, " равно ");
        System.out.println(str4);
    }
}
