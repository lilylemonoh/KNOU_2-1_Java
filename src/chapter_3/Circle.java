package chapter_3;
// 소스 3-19 원 클래스 정의하기
public class Circle {
    private int r;
    public Circle(int a) {
        r = a;
    }

    public double getArea() {
        return r*r*3.141592;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea());
    }
}
