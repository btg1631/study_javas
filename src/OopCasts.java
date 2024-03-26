import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OopCasts {
    public static void main(String[] args) {
        ArrayList<String> listFirst = new ArrayList<>();
        // Array에 값 입력
        listFirst.add("Volvo");
        listFirst.add("3");
        listFirst.add("Ford");
        
        for(String obj:listFirst){
            String temp = obj;
        }

        HashMap<String, Object> question = new HashMap<>();
        question.put("문제", "Python에서 변수를 선언하는 방법은? (점수: 10점)");
        question.put("답항", "1) var name, 2) name=value, 3) set name, 4) name == value");
        question.put("사용자답", 3);
        question.put("Cars", listFirst);

        String strFirst = (String)question.get("문제");
        int intSecond = (int)question.get("사용자답");
        ArrayList<Object> arrayList = (ArrayList<Object>)question.get("Cars");

        System.out.println("Hello World!");
    }
}