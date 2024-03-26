package quests;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class problemsWithoutDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1. 문제: Python에서 변수를 선언하는 방법은? (점수: 10점)",
        "1) var name, 2) name = value, 3) set name, 4) name == value");
        arrayList.add(hashMap);

        // hashMap 변수 재사용 -> new로 새로운 공간 마련
        hashMap = new HashMap<>();
        hashMap.put("2. 문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)",
        "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("3. 문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)",
        "1) if-else, 2) for-in, 3) while, 4) def");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("4. 문제: Python에서 함수를 정의하는 방법은? (점수: 5점)",
        "1) class, 2) def, 3) import, 4) return");
        arrayList.add(hashMap);

        for (int i=0; i<arrayList.size(); i++){
            HashMap<String, String> hashMap1 = arrayList.get(i);
            for (String key:hashMap1.keySet()){
                System.out.println(key);
                System.out.println(hashMap1.get(key));
    
                System.out.print("- 정답: ");
                scanner.nextLine();
            }
        }
        scanner.close();
    }


    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     HashMap<String, String> hashMap = new HashMap<String, String>();

    //     ArrayList<String> list = new ArrayList<String>();
    //     list.add("1. 문제: Python에서 변수를 선언하는 방법은? (점수: 10점)");
    //     list.add("1) var name, 2) name = value, 3) set name, 4) name == value");
    //     list.add("2. 문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
    //     list.add("1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
    //     list.add("3. 문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)");
    //     list.add("1) if-else, 2) for-in, 3) while, 4) def");
    //     list.add("4. 문제: Python에서 함수를 정의하는 방법은? (점수: 5점)");
    //     list.add("1) class, 2) def, 3) import, 4) return");

    //     for (int i=0; i<list.size(); i+=2){
    //         hashMap.put(list.get(i), list.get(i+1));
    //         System.out.println(list.get(i));
    //         System.out.println(list.get(i+1));
    //         System.out.print("- 정답: ");
    //         scanner.nextLine();
    //     }
    // }
}

