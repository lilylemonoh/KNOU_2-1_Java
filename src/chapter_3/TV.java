package chapter_3;

public class TV {
    private int nSize = 0;
    public TV(int nNewSize) {
        nSize = nNewSize;
    }
    public TV() {
        nSize = 20;
    }

    public static void main(String[] args) {
        TV tv = new TV(10); // 이때 생성자가 호출되고 객체가 초기화된다. // 첫번째 생성자가 호출된다
        TV tv2 = new TV(); // 두번째 생성자가 호출된다.
    }

}
