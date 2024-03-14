package chapter_2;
// 교재 49페이지, 소스 2-13, 블록의 예
public class source_2_13 { // 클래스 정의 블록
    public static void main(String[] args) { // 메소드 정의 블록
        int a = 0, b = 0, c;
        { // 명령문 블록
            int d = 0, e, f;
            a = a + b;
            { // 중첩된 명령문 블록
                d++;
            }
        }
    }
}
