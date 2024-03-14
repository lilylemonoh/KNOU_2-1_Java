package chapter_2;
// break 문의 예 1
public class source_2_20 {
    public static void main(String[] args) {
        int nSum = 0;
        int i = 1;
        while (true) {
            nSum += i;
            i++;
            if (i > 10) break;
        }
        System.out.println(nSum);
    }
}
