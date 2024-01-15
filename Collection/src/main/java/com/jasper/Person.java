package com.jasper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private Integer age;


    @Override
    public int compareTo(Person o) {
        if(this.age<o.age){
            return -1;
        }
        if (this.age>o.age){
            return 1;
        }
        return 0;
    }
}
