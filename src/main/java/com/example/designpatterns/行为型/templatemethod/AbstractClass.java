package com.example.designpatterns.行为型.templatemethod;

public abstract class AbstractClass {
    public void TemplateMethod(){
        //公共的方法交由抽象父类的具体方法实现
        specificMethod();
        // 非公有的方法由不同的子类不同的实现
        abstractMethod1();
        // 非公有的方法由不同的子类不同的实现
        abstractMethod2();
    }

    protected abstract void abstractMethod2();

    protected abstract void abstractMethod1();

    public  void specificMethod(){
        System.out.println("这是公用的模块");
    }
}
