package chapter_2;

// 소스 2-31 + 연산자의 사용
public class source_2_31 {
    public static void main(String[] args) {
        String szStr1 = "Java ";
        String szStr2 = "Application";
        String szStr3 = szStr1 + szStr2;
        szStr3 = "Java " + 2;
        szStr3 = "Java " + 2.0;
        szStr3 = true + " lies";
        System.out.println(szStr3);
    }
}
