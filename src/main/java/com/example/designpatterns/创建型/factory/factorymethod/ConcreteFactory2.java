package com.example.designpatterns.创建型.factory.factorymethod;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }
}
