package com.dong.demo.model;

import com.dong.demo.utils.IOutputHelper;

/**
 * Created by dchuan on 2016/3/13.
 */
public class Employee {

    // Fields

    private String name;
    private int age;
    private String department;
    private IOutputHelper iOutputHelper;

    // Functions

    public void info() {
        iOutputHelper.generateInfo(this);
    }

    // Setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public IOutputHelper getiOutputHelper() {
        return iOutputHelper;
    }

    public void setiOutputHelper(IOutputHelper iOutputHelper) {
        this.iOutputHelper = iOutputHelper;
    }
}
