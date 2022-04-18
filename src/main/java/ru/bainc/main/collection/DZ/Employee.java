package ru.bainc.main.collection.DZ;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class Employee {
    private int tabNumber;
    private String name;
    private String surname;
    private boolean active;// boolean

 /*   public Employee(int tabNumber, String name, String surname, String priznakUvolennosti) {
        this.tabNumber = tabNumber;
        this.name = name;
        this.surname = surname;
        this.priznakUvolennosti = priznakUvolennosti;
    }
*/

}