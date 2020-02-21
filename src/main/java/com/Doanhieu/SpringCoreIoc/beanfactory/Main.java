package com.Doanhieu.SpringCoreIoc.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        //tao factory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //doc caau hinh  file cau hinh  vaf gan vao  factory
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);;
        reader.loadBeanDefinitions(new ClassPathResource("config/beans.xml"));
        //t?o ??i t??ng
        HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
        obj.getMessage();
    }
}
