package CollectionFramework.ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    public int id;
    public String name;
    public int age;
    public long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id= " + id + ", name= " + name + ", age= " + age + ", salary= " + salary + "]";
    }
    
}

public class ArrayLists4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(30);
        System.out.println(list);

        Collections.sort(list);     // bydefault Ascending order
        System.out.println(list);

        Collections.reverse(list);  // Decending order
        System.out.println(list);


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Sanjiv", 30, 45000));
        employees.add(new Employee(20, "Abhishek", 29, 50000));
        employees.add(new Employee(30, "Ranjit", 35, 40000));
        employees.add(new Employee(40, "Barney",34, 90000));

        Collections.sort(employees, new Mysort());   
        System.out.println(employees);
        
        //Annonumus Implementation of Comparator Interface
        Collections.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                // return (int) (o1.getSalary() - o2.getSalary());     // ascending order
                return (int) (o2.getSalary() - o1.getSalary());        // decending order
            }    
        });
        System.out.println(employees);


    //    ( o1, o2) ->{(int) (o1.getSalary() - o2.getSalary())} 

        //Comparator interface with Lamda Expression
       Collections.sort(employees,(o1, o2) -> o1.getAge() - o2.getAge());  // ascending order(by age)
       System.out.println(employees);
        
        //Ascending orber (by Name)
       Collections.sort(employees, (o1,o2) -> o1.getName().compareTo(o2.getName()));  // (by Name)
       System.out.println(employees);


    }
    
}
class Mysort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());     // ascending order
        // return (int) (o2.getSalary() - o1.getSalary());  // decending order
    }

}
