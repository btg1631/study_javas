package quests;

import java.util.Scanner;
import java.util.ArrayList;

public class pollsWithoutDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> listquestion = new ArrayList<String>();
        listquestion.add("인터스텔라 선호도");
        listquestion.add("해리포터 선호도");
        listquestion.add("파묘 선호도");

        ArrayList<String> listanswer = new ArrayList<String>();
        listanswer.add("1) 좋음 2) 중간 3) 나쁨");

        ArrayList<String> listresult = new ArrayList<String>();

        for (int i=0; i<listquestion.size(); i++){
            System.out.println(i+1+". "+listquestion.get(i));
            for (int j=0; j<listanswer.size(); j++){
                System.out.println(listanswer.get(j));
            }

            // 답한 내용 받기
            System.out.print("답하기 : ");
            String result = scanner.nextLine();
            listresult.add(result);
        }
        System.out.println("답한 내용 출력: "+listresult);
        scanner.close();
    }
}   
