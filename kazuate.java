import java.util.Scanner;
import java.util.Random;

public class kazuate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("数当てゲームです。2桁の数字を入力してください");
        Random rand = new Random();
        int num = rand.nextInt(90) + 10;
        try {
            for (i = 0; i < 5; i++) {
                int num1 = scan.nextInt();
                if (num1 == num) {
                    System.out.println("あたり!!");
                    scan.close();
                    break;
                } else {
                    System.out.println("ハズレ!!");
                    if (num1 - num > 0) {
                        System.out.println("正解よりも大きいです");
                    } else {
                        System.out.println("正解よりも小さいです");
                    }
                    if (Math.abs(num1 - num) > 19) {
                        System.out.println("正解と20以上の差があります");
                    }
                    if (i == 4) {
                        System.out.println("ゲームオーバーです。正解は" + num + "です");
                        scan.close();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("入力が正しくありません。");
        }
    }
}