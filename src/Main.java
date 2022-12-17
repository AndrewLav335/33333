import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("���������� - ������ ����������");

        Scanner sc = new Scanner(System.in);

        System.out.println("������� �����");

        int moneyAmount = sc.nextInt();
        sc.close();
        System.out.println("�� ������ " + moneyAmount + " ���.");

        int[] drinkPrices = {200, 100, 50, 75};
        String[] drinkNames = {"��������", "��������", "����", "������"};

        boolean canBuyAnything = false;

        int length = Math.min(drinkPrices.length, drinkNames.length);

        for (int i = 0; i < length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("�� ������ ������ " + drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything) {
            System.out.println("������������ ������� :( �������� Java � ������������� �����!))");
        }
    }
}