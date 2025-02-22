import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // создание первого экземпляра с установленным значением threshold
        SentenceFilterLonger instance1 = SentenceFilterLonger.getInstance();

        // ввод порога
        System.out.print("Введите порог для фильтрации предложений: ");
        int threshold = in.nextInt();
        instance1.setThreshold(threshold); // устанавливаем порог

        in.nextLine();

        System.out.print("Введите текст: ");
        String text = in.nextLine();

        // выполнение фильтрации предложений
        instance1.filterByLength(text);

        // вывод порога первого экземпляра
        System.out.println("\nПорог у первого экземпляра: " + instance1.getThreshold());

        // создание второго экземпляра и вывод порога
        SentenceFilterLonger instance2 = SentenceFilterLonger.getInstance();
        System.out.println("\nПорог у второго экземпляра: " + instance2.getThreshold());
    }
}