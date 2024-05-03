package DesignPattern.FactoryDesign;

public class DeveloperClint {
   
    public static void main(String[] args) {

        Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
        int salery1 = employee1.getSalery();
        System.out.println(salery1);

        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        int salery2 = employee2.getSalery();
        System.out.println(salery2);

        Employee employee3 = EmployeeFactory.getEmployee("Developer");
        int salery3 = employee3.getSalery();
        System.out.println(salery3);
    }
}
