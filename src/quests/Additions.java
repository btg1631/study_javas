package quests;

import java.util.Scanner;

public class Additions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();

        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();

        int result = intFirst + intSecond;
        System.out.println(intFirst+" + "+intSecond+" = "+result);

        scanner.close();  // 자원 반납
    }
}
