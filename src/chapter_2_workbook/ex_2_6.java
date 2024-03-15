package chapter_2_workbook;
// 소스 2-6 1차원 배열을 사용하는 Java 프로그램
public class ex_2_6 {
    public static void main(String[] args) {
        int[] anArray; // 배열의 선언
        anArray = new int[10]; // 10개의 원소를 가지는 배열의 생성

        anArray[0] = 100; // 첫 번째 원소
        anArray[1] = 200;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 9: " + anArray[9]);

    }
}
