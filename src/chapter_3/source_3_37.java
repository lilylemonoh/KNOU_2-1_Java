package chapter_3;
// 소스 3-37 this()의 사용 예
public class source_3_37 {
    double x = 10.0;
    public source_3_37() {
        x = 20.0;
    }
    public source_3_37(double new_x) {
        this();
        x = x + new_x;
    }

    public static void main(String[] args) {
        source_3_37 mc = new source_3_37(10);
        System.out.println(mc.x);
    }
}
