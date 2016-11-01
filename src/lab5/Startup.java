/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import common.Employee;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
        
        List<Employee> employees = new ArrayList<>();
      
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        Employee retrieve = employees.get(2);
        
        System.out.println(retrieve.toString());
        
        
        for(int i=0; i < employees.size(); i++){
            Employee retrieve2 = employees.get(i);
            System.out.println(retrieve2);
        }
        
        for(Employee e : employees){
            System.out.println(e);
        }
        
    
        
        System.out.println(employees.size());
        
        employees.add(new Employee("Tester", "Test", "999-99-9999"));
        
        for(Employee e : employees){
            System.out.println(e);
        }
        
        Set<Employee> noDupes = new LinkedHashSet<>(employees);
        
        employees = new ArrayList<>(noDupes);
        
        for(Employee e : employees){
            System.out.println(e);
        }
        
    }
   
}