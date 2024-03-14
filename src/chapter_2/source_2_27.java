package chapter_2;
// 소스 2-27 초기값 없이 배열 생성하기
public class source_2_27 {
    public static void main(String[] args) {
        //1차원 배열의 생성
        int anArray1[] = new int[5];
        int[] anArray2 = new int[5];
        int anArray3[];
        anArray3 = new int[5];

        // 2차원 배열의 생성
        int anArray4[][] = new int[3][2];
        int[][] anArray5 = new int[3][2];

        // 초기값 없이 배열을 생성한 경우 배열 원소의 자료형이 숫자형이라면
        // 자동으로 0 또는 0.0으로 초깃값 설정, 그 외에는 null
    }
}
