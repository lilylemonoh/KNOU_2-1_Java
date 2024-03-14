package chapter_2;
// 레이블이 붙은 continue 문의 예
public class source_2_23 {
    public static void main(String[] args) {
        int nSum = 0;
        my_loop:
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) continue my_loop;
            nSum += i;
        }
    }
}
