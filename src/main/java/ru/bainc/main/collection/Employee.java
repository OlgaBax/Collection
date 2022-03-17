package ru.bainc.main.collection;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee implements Comparable <Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString (){
        return "Employee {" +
                "id =" + id +
                " , name = '" + name +'\'' +
                " , salary = " + salary +
                '}';

    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id - anotherEmployee.id;
        if ( result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}
