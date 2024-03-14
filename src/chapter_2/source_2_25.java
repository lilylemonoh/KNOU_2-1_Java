package chapter_2;
// 소스 2-25 배열 선언의 예
public class source_2_25 {
    public static void main(String[] args) {
        // 1차원 배열의 선언
        int anArray1[];
        int[] anArray2;
//        int anArray3[10]; // 오류, 크기를 명시할 수 없다.
//        anArray1[0] = 1; // 오류, 배열 초기화나 생성 전에는 사용할 수 없다.

        // 2차원 배열의 선언
        int anArray4[][];
        int[][] anArray5;
        int[] anArray6[]; // 오류는 아니지만 좋지 않은 표현이다.
    }
}
