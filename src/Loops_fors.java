// refer : https://www.w3schools.com/java/java_for_loop.asp
public class Loops_fors {
    public static void main(String[] args){
        /* 
            for 동작 위한 조건 : 시작점, 종료 조건, 반복 횟수
            statement 1 : 시작점
            statement 2 : 종료 조건
            statement 3 L 반복 횟수
         * for (statement 1; statement 2; statement 3){
         * }
         */
        /*
        예제 : 1부터 5까지 1씩 증가하며 출력하는 것
         */
        // for (int count = 1; count <= 5; count = count + 1) {
        for (int count = 1; count <= 5; count++) {
            System.out.println("for count : "+count);
        }
    }
}
