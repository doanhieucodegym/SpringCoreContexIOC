package com.Doanhieu.SpringCoreIoc.beanfactory;

public class HelloWorld {
    private String message;
    public void getMessage(){
        System.out.println("Print :" +message);
    }

    public void setMessage(String message) {
        this.message= message;
    }
}
