package ru.bainc.main.collection;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double grade;

    public Student(String name, char sex, int age, int course, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name='" + name + '\'' +
                ", sex=" + sex +
                " ,age=" + age +
                " ,course=" + course +
                " ,grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex
                && age == student.age
                && course == student.course
                && Double.compare(student.grade, grade) == 0
                && Objects.equals(name, student.name);
    }

}
