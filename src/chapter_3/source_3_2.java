package chapter_3;

// 소스 3-2 잘못된 클래스의 정의

// 필드의 지정문을 메소드 외부에 넣을 수 없다.
// 하지만 지정문을 중괄호 블록 안에 두면 클래스 내부에 들어갈 수 있다.
// 이러한 블록을 초기화 블록이라고 하며, 초기화 블록에는 연산식이나 제어문도 들어갈 수 있다.
public class source_3_2 {
    private int nVoltage = 0;
//    nVoltage = 1; // 오류
    {nVoltage = 1;} // 오류 아님
    public void turnOn(int nInputVoltage) {
        nVoltage = nInputVoltage;
    }

    public void turnOff() {
        nVoltage = 0;
    }

    public int getnVoltage() {
        return nVoltage;
    }
}
