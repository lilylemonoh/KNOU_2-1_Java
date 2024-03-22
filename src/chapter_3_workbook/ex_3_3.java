package chapter_3_workbook;
// 워크북 38페이지 : 상속 관계의 Employee 클래스와 Salesman 클래스
public class ex_3_3 {
    class Employee {
        int nSalary;
        String szDept = null;
        public void doJob() {
            System.out.println("Do something");
        }
    }

    class Salesman extends Employee {
        public Salesman() {
            this.szDept = "Sales Dept";
        }
        public void doJob() {
            System.out.println("Do sales");
        }
    }
}
