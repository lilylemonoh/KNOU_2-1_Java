package chapter_3;
// 소스 3-1 Electronics 클래스의 정의
public class source_3_1 {

    class Electronics {
        private int nVoltage = 0;

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
}
