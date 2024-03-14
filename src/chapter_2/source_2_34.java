package chapter_2;

import java.util.Scanner;

// 소스 2-23 한글 입출력
public class source_2_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "euc-kr");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
