package chapter_2_workbook;
// 2차원 배열을 사용하는 Java 프로그램
public class ex_2_7 {
    public static void main(String[] args) {
        String[][] names = {{"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}};
        System.out.println(names[0][0] + names[1][0]); // Mr.Smith
        System.out.println(names[0][2] + names[1][1]); // Ms. Jones
    }
}
