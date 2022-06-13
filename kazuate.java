import java.util.Scanner;
import java.util.Random;
 
public class kazuate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("数当てゲームです。2桁の数字を入力してください");
        Random rand = new Random();
        int num = rand.nextInt(89) + 10;
        for (i = 0;i < 5;i++) {
            int num1 = scan.nextInt();
            if (num1 == num) {
                 System.out.println("あたり!!");
                 break;
            } else {
                System.out.println("ハズレ!!");
                if (Math.abs(num1-num) > 19) {
                    System.out.println("正解と20以上の差があります");
                }
                if (i == 4) {
                    System.out.println("ゲームオーバーです。正解は" + num + "です");
                }
            }
        }

        scan.close();
    }
}