package ru.bainc.main.collection;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Student1 {
    private String name;
    private int course;

    public Student1(String name, int course) {
        this.name = name;
        this.course = course;
    }
    @Override
    public String toString (){
        return "Student { " +
                "name='" + name + '\'' +
                "course='" + course +'\''+
                '}';
    }


}
