package chapter_3;
// 소스 3-21 Circle 클래스를 이용하여 Cylinder 클래스 정의하기
public class Cylinder {
    private Circle c; // 밑면
    private int h; // 높이
    public Cylinder(Circle a, int b) {
        c = a;
        h = b;
    }

    public double getVolume() {
        return c.getArea()*h;
    }

    // 소스 3-22 원기둥의 부피 구하기
    public static void main(String[] args) {
        Circle c = new Circle(7);
        int h = 8;
        Cylinder cy = new Cylinder(c, h);
        System.out.println(cy.getVolume());
    }
}
