package designPattern.factoryDesign;

/**
 *   Factory Design Pattern ---> 
 * 
 *      When there is a super class and mutliple sub clasess and we want to crate onjects of sub clasess based
 *      on the some input provided at run time
 * 
 *      for this we create a Factory Class which the requirement as  a input and create object
 *      base on that input
 * 
 * 
 *   Addvantages of Factory Design Pattern 
 *    
 *     1. It focus on creating object for interface rather than implementaion
 *     2. Loose Coupling more robust code 
 *     3. We can modify Object Creaction at run time.  
 * 
 */


public class EmployeeFactory {
    
    private EmployeeFactory(){}

    public static Employee getEmployee(String empType) {

        if(empType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();

        }else if(empType.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }else{
            System.err.println("Invalid Employee Type");;
            return null;
        }
    }
}
