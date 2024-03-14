package chapter_2;
// 교재 52페이지, 소스 2-16, switch문의 예
public class source_2_16 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch (n) {
            case 10:
                System.out.println("10입니다.");
                break;
            case 20:
            case 30:
                System.out.println("20이거나 30입니다.");
                break;
            default:
                System.out.println("모르겠습니다.");
                break;
        }
    }
}
