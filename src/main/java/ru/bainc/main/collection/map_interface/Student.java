package ru.bainc.main.collection.map_interface;

import lombok.Getter;

import java.util.Objects;

@Getter
final class Student implements Comparable<Student> {
    final private String name;
    final private String surname;
    final private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    //    @Override
//    public int hashCode() {   // этот вариант java выдает
//        return Objects.hash(name, surname, course);
//    }
    public int hashCode() {      // это сами перезаписали
        return name.length() * 7 + surname.length() * 3 + course * 53;
    }
}


