package chapter_2;
// 교재 52페이지, 소스 2-15, if-else 문의 예
public class source_2_15 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n > 10) {
            System.out.println("10보다 크다");
        } else if (n < 3) {
            System.out.println("3보다 작다");
        } else {
            System.out.println("3보다 크거나 같고 10보다 작거나 같다.");
        }
    }
}
