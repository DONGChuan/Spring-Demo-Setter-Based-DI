package com.dong.demo;

import com.dong.demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dchuan on 2016/3/13.
 */
public class Main {

    public static void main(String[] args) {

        // Load bean configuration form applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Generate employeeDONG info on json and output on console
        Employee employeeDONG = context.getBean("employeeDONG", Employee.class);
        employeeDONG.info();

        // Generate employeeLI info on json and output on console
        Employee employeeLI = context.getBean("employeeLI", Employee.class);
        employeeLI.info();
    }

}
