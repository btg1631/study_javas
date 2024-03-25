// https://www.w3schools.com/java/java_strings.asp

public class DataTypeStrings {
    public static void main(String[] args){
        String strFirst = "Hello !";
        String strSecond = new String("World !");
        // strFirst instanceof String
        // true
        // strSecond instanceof String
        // true

        // strFirst.length()
        // 7
        // strSecond.length()
        // 7
        // strSecond.concat(strFirst)
        // "World !Hello !"
        // String strThird = strFirst.replaceAll("l", "R")
        // String strThird = strFirst.replaceAll("ll", "RR")
        System.out.println("Hello Main !");
    }
}
