package chapter_2_workbook;
// 소스 2-3 명령행 인자를 사용하는 Java 프로그램
public class ex_2_3 {
    // 프로그램을 실행시킬 때 프로그램 이름 뒤에 나열되는 단어들이 main 함수의 인자가 된다.
    // java Test first second (Test라는 클래스 실행)
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
