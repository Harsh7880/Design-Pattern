package DesignPattern.Singleton;

public class classA {

    private static classA firstClass;
    
    private classA(){
      if(firstClass != null){
        throw new RuntimeException("You are trying to break Singleton Pattern");
      }
    }

    // Lazy way of creating singleton object
    public static classA  getObject(){
       if(firstClass==null){
        synchronized(classA.class){
            firstClass = new classA();
        }
       }
        return firstClass;
    }
}

/**
 * 
 * How to create Singleton Object
 * 
 * 1. Private Constructor
 * 
 * 2. Create Object with the help of method and return it
 * 
 * 3. create private filed to store the object so that no one cna access it form outside of thr class
 * 
 * Note: Please take care of Thread Security while working with Singleton Design Pattern, 
 * this can be handled by using synchronized keyword which will allow only one thred to access this class at a time
 * 
 * 
 * How to breake Singleton Pattern
 * 
 * 1. Reflication API --> to brek Singleton pettren
 * 
 *    Solution ---> 
 *        1) if object is already there throw exception insdide from constructor
 *         2) use Enums
 * 
 * 
 * 2. Deserilization
 */