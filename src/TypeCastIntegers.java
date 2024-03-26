// https://www.w3schools.com/java/java_type_casting.asp

import java.util.Scanner;

public class TypeCastIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두개 값 받기
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();

        // 값을 받고싶을 때 Integer 사용?? 연산할 때는 캐스트 사용??
        int intFirst = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);

        // strFirst + strSecond
        // "12"
        // intFirst + intSecond
        // 3
        // (int) strFirst

        scanner.close();
    }
}
