import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        // ユーザー名の入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
	System.out.print(">");
        String name = scanner.nextLine();

        // ユーザーへの挨拶を表示
        System.out.println("Hello, " + name + "!");

        // 2つのダイスを振る
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;

        // ダイスの結果を表示
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        int totalValue = die1 + die2;
        System.out.println("Total value: " + totalValue);

        // 勝敗の判定と結果の表示
        if (totalValue > 7) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost.");
        }
    }
}
