
package lab4;

import common.Employee;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author amellem
 */
public class Startup {
    public static void main(String[] args) {
        
        
        Employee e1 = new Employee("Smith", "Bob", "123-45-6789");
        Employee e2 = new Employee("Smith", "Bob", "123-45-6789");
        Employee e3 = new Employee("Bob", "Smith", "345-12-6789");
        Employee e4 = new Employee("Doe", "Jane", "987-65-4321");
        
        Set<Employee> employees = new LinkedHashSet<>();
      
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        
        
        for(Employee e : employees){
            System.out.println(e);
        }
        
        employees.remove(e2);
        
        System.out.println(employees.size());
        
        employees.add(new Employee("Tester", "Test", "999-99-9999"));
        
        for(Employee e : employees){
            System.out.println(e);
        }
        
    }
   
}