package chapter_3;
// 소스 3-15 static 필드의 사용 3
public class MyMessages {
    public static String msg1 = "Hello";
    public static String msg2 = "Java";
    public static String msg3 = "Application";
    public static String msg4 = "Applet";

    public static void main(String[] args) {
        System.out.println(MyMessages.msg1);
        System.out.println(MyMessages.msg2);
        System.out.println(MyMessages.msg3);
        System.out.println(MyMessages.msg4);
    }
}

