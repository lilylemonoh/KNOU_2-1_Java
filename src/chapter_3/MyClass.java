package chapter_3;
// 소스 3-12, 3-13, 3-14, 3-16, 3-17
public class MyClass {
    private int nMyField = 0;

//    public static int nStaticField = 0;

    public static int nStaticField1 = 10;
    public static int nStaticField2;

    public static int nStaticField = 10;
    static void setStaticField(int n) {
        nStaticField = n;
    }

    static int getStaticField() {
        return nStaticField;
    }

    public MyClass() {
        nStaticField2 = 20;
    }

    public void setMyField(int nNewField) {
        nMyField = nNewField;
    }
    public int getMyField() {
        return nMyField;
    }

    public static void main(String[] args) {
        MyClass myObject1, myObject2;
        myObject1 = new MyClass();
        myObject2 = new MyClass();

        myObject1.setMyField(10);
        myObject2.setMyField(20);

        System.out.println(myObject1.getMyField());
        System.out.println(myObject2.getMyField());

        myObject1.nStaticField = 10;
        System.out.println(myObject2.nStaticField);
        myObject2.nStaticField += 10;
        System.out.println(myObject1.nStaticField);

        MyClass.nStaticField = 10;
        System.out.println(MyClass.nStaticField);

        MyClass mc1 = new MyClass();
        System.out.println("mc1 is constructed.");
        System.out.println("nStaticField1 = " + mc1.nStaticField1);
        System.out.println("nStaticField2 = " + mc1.nStaticField2);
        MyClass.nStaticField1 += 10;
        MyClass.nStaticField2 += 10;
        System.out.println("Values are changed.");
        System.out.println("nStaticField1 = " + mc1.nStaticField1);
        System.out.println("nStaticField2 = " + mc1.nStaticField2);

        MyClass mc2 = new MyClass();
        System.out.println("mc2 is constructed.");
        System.out.println("nStaticField1 = " + mc1.nStaticField1);
        System.out.println("nStaticField2 = " + mc2.nStaticField2);

        MyClass mc = new MyClass();
        mc.setStaticField(20);
        System.out.println(mc.getStaticField());
        MyClass.setStaticField(30);
        System.out.println(MyClass.getStaticField());


    }

}
