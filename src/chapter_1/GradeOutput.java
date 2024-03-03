package chapter_1;
// 교재 26페이지, 소스 1-5
public class GradeOutput {
    public static void main(String[] args) {
        Grade g1, g2; // 2명의 성적을 표현하기 위한 객체
        g1 = new Grade();
        g2 = new Grade();
        g1.e = 90; // 점수 입력
        g1.m = 85;
        g2.e = 80;
        g2.m = 80;

        g1.output_grade();
        g2.output_grade();
    }
}
