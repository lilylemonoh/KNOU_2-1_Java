package chapter_2;

// 소스 2-22 continue문의 예
public class source_2_22 {
    public static void main(String[] args) {
        int nSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) continue;
            nSum += i;
        }
    }
}