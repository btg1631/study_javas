// https://www.w3schools.com/java/java_hashmap.asp

import java.util.HashMap;

public class DatatypeHashMaps {
    public static void main(String[] args) {
        // 2개 캐스팅 <String, String>
        HashMap<String, String> hashMap = new HashMap<String, String>();
        // 값 넣기
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");

        // hashMap.get("Norway")
        // "Oslo"
        // hashMap.remove("Germany")
        // "Berlin"
        // hashMap.size()
        // 2

        for (String key:hashMap.keySet()){
            System.out.println("hashMap value with key : "
                                +key+", value : "+hashMap.get(key));
        }

        System.out.println("Hello World!");
       // return 0; 
    }
}