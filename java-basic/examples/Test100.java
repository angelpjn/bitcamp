
// 
package bitcamp.java100;

public class Test100 {
    public static void main(String[] args){
        class EmployeesSalary {
            String name;
            String position;
            int wage;
            double pro;
            double sal;
            void employeesSalary (){
                sal = (wage * 12)*(1+pro); 
            }
        }

        EmployeesSalary emp1 = new EmployeesSalary();

        emp1.name = "박정남";
        emp1.position = "상품개발";
        emp1.wage = 5000000;
        emp1.pro = .5;
        emp1.employeesSalary();

        System.out.printf("%s %s %d %.1f %.5f", emp1.name, emp1.position, emp1.wage, emp1.pro, emp1.sal);

    }
}