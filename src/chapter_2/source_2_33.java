package chapter_2;

import java.util.Scanner;

// Scanner 클래스를 이용한 문자열 입출력 예제
public class source_2_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
