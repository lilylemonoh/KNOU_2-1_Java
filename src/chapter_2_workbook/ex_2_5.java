package chapter_2_workbook;
// 소스 2-5 향상된 for 반복문을 사용하는 Java 프로그램
public class ex_2_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
}
