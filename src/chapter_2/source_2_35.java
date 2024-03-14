package chapter_2;

import java.util.Scanner;

// 소스 2-25 Scanner 클래스를 이용한 정수형 숫자 입출력 예제
public class source_2_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextInt());
        }
    }
}
