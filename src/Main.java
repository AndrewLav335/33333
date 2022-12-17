import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кофемашина - Андрей Лаврентьев");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму");

        int moneyAmount = sc.nextInt();
        sc.close();
        System.out.println("Вы внесли " + moneyAmount + " руб.");

        int[] drinkPrices = {200, 100, 50, 75};
        String[] drinkNames = {"капучино", "эспрессо", "вода", "молоко"};

        boolean canBuyAnything = false;

        int length = Math.min(drinkPrices.length, drinkNames.length);

        for (int i = 0; i < length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }
    }
}