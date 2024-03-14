package chapter_2;
//소스 2-28 배열의 크기
public class source_2_28 {
    public static void main(String[] args) {
        int anArray1[] = new int[5];
        for (int i = 0; i < anArray1.length; i++) {
            anArray1[i] = i;
            System.out.println(anArray1[i]);
        }
        int anArray2[][] = new int[3][2];
        for (int i = 0; i < anArray2.length; i++) {
            for (int j = 0; j < anArray2[i].length; j++) {
                anArray2[i][j] = i;
                System.out.println(anArray2[i][j]);
            }
        }
    }
}
