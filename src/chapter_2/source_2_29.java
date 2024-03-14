package chapter_2;

// 문자열의 생성 1
public class source_2_29 {
    // 문자열형은 참조형에 속하지만 생성이나 초기화 방법은 기본형과 매우 흡사하다.
    public static void main(String[] args) {
        String szStr1 = "Java Application";
        String szStr2, szStr3;
        szStr2 = "Java Applet";
        szStr3 = szStr2;
    }
}
