package chapter_3;
// 소스 3-6 객체의 사용
public class source_3_6 {
    public static void main(String[] args) {
        Electronics b = new Electronics();
        b.turnOn(10);
        int a = b.getnVoltage();

        Electronics c = new Electronics();
        c.turnOn(20);

        int d = c.getnVoltage();

    }
}
