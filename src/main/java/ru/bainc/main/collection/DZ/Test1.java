package ru.bainc.main.collection.DZ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    static Employee employee1 = new Employee(123, "Ivan", "Ivanov", true);
    static Employee employee2 = new Employee(456, "Mariya", "Perova", true);
    static Employee employee3 = new Employee(789, "Petr", "Sidorov", true);
    static Employee employee4 = new Employee(1234, "Igor", "Petrov", true);
    static Employee employee5 = new Employee(1235, "Oleg", "Gukov", true);
    static Employee employee6 = new Employee(1236, "Natalia", "Serova", true);
    static Employee employee7 = new Employee(1237, "Olga", "Bachtina", true);
    static Employee employee8 = new Employee(12341, "Aleksey", "Makarov", true);
    static Employee employee9 = new Employee(12342, "Katya", "Medvedeva", true);
    static Employee employee10 = new Employee(12568, "Gleb", "Gribov", true);
    static Employee employee11 = new Employee(13568, "Yuriu", "Grachev", true);
    static Employee employee12 = new Employee(119872, "Egor", "Mironov", true);
    static Employee employee13 = new Employee(1489, "Irina", "Aksenova", true);
    static Employee employee14 = new Employee(9, "Oksana", "Turina", true);
    static Employee employee15 = new Employee(125, "Natalia", "Serova", true);

    public static void main(String[] args) {

        updateEmployee(getEmployeeFromBase(), getEmployeeFromHH()).forEach(x -> System.out.println(x));
    }

    public static List<Employee> updateEmployee(List<Employee> oldEmployee, List<Employee> hhEmployee) {
        List<Employee> result = new ArrayList<>();
        HashMap<Integer, Employee> oldEmployeeMap = getMapFromList(oldEmployee);
        HashMap<Integer, Employee> hhEmployeeMap = getMapFromList(hhEmployee);
        List<Employee> newEmployeeList = new ArrayList<>();
        for (Integer tabNum : hhEmployeeMap.keySet()) {
            if (!oldEmployeeMap.containsKey(tabNum)) {
                newEmployeeList.add(hhEmployeeMap.get(tabNum));
            }
        }
        for (Integer tabNum : oldEmployeeMap.keySet()) {
            if (!hhEmployeeMap.containsKey(tabNum)) {
                oldEmployeeMap.get(tabNum).setActive(false);
            }
        }
        result.addAll(oldEmployee);
        result.addAll(newEmployeeList);
        return result;
    }

    public static HashMap<Integer, Employee> getMapFromList(List<Employee> employeeList) {
        return (HashMap<Integer, Employee>) employeeList.stream()
                .collect(Collectors.toMap(element -> element.getTabNumber(), element -> element));

    }

    public static List<Employee> getEmployeeFromBase() {
        List<Employee> result = new ArrayList<>();
        result.add(employee1);
        result.add(employee2);
        result.add(employee3);
        result.add(employee4);
        result.add(employee5);
        result.add(employee6);
        result.add(employee7);
        result.add(employee8);
        result.add(employee9);
        result.add(employee10);
        return result;
    }

    public static List<Employee> getEmployeeFromHH() {
        List<Employee> result = new ArrayList<>();
        result.add(employee1);
        result.add(employee2);
        result.add(employee3);
        result.add(employee4);
        result.add(employee5);
        result.add(employee11);
        result.add(employee12);
        result.add(employee13);
        result.add(employee14);
        result.add(employee15);
        return result;
    }
    // в результирующим листе должно быть 15 работников: 5старых,5новых и 5 уволенных.

}
