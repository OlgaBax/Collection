package ru.bainc.main.collection.set_interface;

import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
public class Student implements Comparable <Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name='" + name + '\'' +
                "course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }
}


