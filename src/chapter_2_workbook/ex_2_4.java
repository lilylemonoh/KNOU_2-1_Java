package chapter_2_workbook;
// 소스 2-4 for 반복문을 사용하는 Java 프로그램
public class ex_2_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0, item = numbers[0]; i< numbers.length; item = numbers[i++]) {
            System.out.println("Count is: " + item);
        }
    }
}
