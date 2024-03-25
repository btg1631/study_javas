package quests;

import java.util.Scanner;

public class WhilesIfsBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean whileFlag = true;
        while (whileFlag) {
            System.out.print("점수 입력 : ");
            int score = scanner.nextInt();
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score == -1) {
                break;
            } else {
                System.out.println("F");
            }
        }
        scanner.close();
    }
}
