package chapter_2;
public class source_2_7to12 {
    public static void main(String[] args) {
        // 교재 42페이지, 소스 2-7, boolean형의 사용
        boolean bFlag1, bFlag2;
        bFlag1 = true;
        bFlag1 = false;
        bFlag2 = 45 < 29;
        bFlag2 = bFlag1;

        // 교재 42페이지, 소스 2-8, 참조형의 예
        int anArray[];
        String szString;

        // 교재 42페이지, 소스 2-9, 자료형에 따른 오류
        int a = 3;
//        String s = a; // 자료형의 종류가 아주 다름, 컴파일 에러
        float f;
//        a = f; // 자료의 손실이 발생할 수 있음, 컴파일 에러

        // 교재 43페이지, 소스 2-10, 묵시적 형변환
        float ff = 5.5f;
        double d = ff;

        // 교재 43페이지, 소스 2-11, 명시적 형변환
        int aa = 3;
        float fff = (float) aa;
        double dd;
        fff = (float)d;

        // 교재 44페이지, 소스 2-12, final을 이용한 상수 선언의 예
        final int nConst = 3;


    }

}
