package quests;

import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number :");
        int number = scanner.nextInt();

        for (int count=0; count <= number; count++) {
            int result = (int) Math.pow(2, count);
            if (result % 8 == 0){
                System.out.println("2 ** "+count+" = "+result);
            }
            else {
                System.out.println(count+" : 2 ** "+count+" = "+result+" 8 배수 아님");
            }
        }
        scanner.close();  // 자원 반납
    }
    
}


// - 입력 받은 값을 2에 지수 연산하고, 8 배수일 때만 출력
// ex ) input number : 50 
//  0 : 2 ** 0 4 배수 아님        -> 확인용
//  1 : 2 ** 1 4 배수 아님
//  2 ** 2 = 4
//  2 ** 3 = 8
//  2 ** 4 = 16
// ...