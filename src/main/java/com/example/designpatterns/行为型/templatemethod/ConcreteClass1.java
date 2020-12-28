package com.example.designpatterns.行为型.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void abstractMethod2() {
        System.out.println("我是具体子类1的具体实现2");
    }

    @Override
    protected void abstractMethod1() {
        System.out.println("我是具体子类1的具体实现1");
    }
}
