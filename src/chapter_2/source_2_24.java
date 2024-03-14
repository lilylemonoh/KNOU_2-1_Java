package chapter_2;
// 소스 2-24 변수의 유효범위
public class source_2_24 {
    public static void main(String[] args) {
        int outer = 1; {
            int inner = 2;
            System.out.println("inner = " + inner);
            System.out.println("outer = " + outer);
        }
        int inner  = 3;
        System.out.println("inner = " + inner);
        System.out.println("outer = " + outer);
    }
}
