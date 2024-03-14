package chapter_2;
// 교재 50페이지, 소스 2-14, 명령행 매개변수의 사용
public class source_2_14 {
    public static void main(String[] args) {
        System.out.println(args[0] + ", " + args[1]);
    }
}
// intellij -> Modify Run Configuration에서 Program Arguments에 명령행 매개변수로 사용될 값 입력하기