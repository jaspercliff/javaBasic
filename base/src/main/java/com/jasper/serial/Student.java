package com.jasper.serial;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -5809782578272943999L;
    private String id;
    private String name;
    private Integer age;
    private String serialId;
}
