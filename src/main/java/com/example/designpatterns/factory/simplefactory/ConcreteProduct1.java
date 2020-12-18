package com.example.designpatterns.factory.simplefactory;

public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("我是产品1");
    }
}
