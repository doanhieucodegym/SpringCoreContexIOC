package com.Doanhieu.SpringCoreIoc.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("config/applicationContext.xml");
        DataResource obj = (DataResource) context.getBean("da");
        obj.printConnection();
    }
}
