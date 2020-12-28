package com.example.designpatterns.创建型.factory.factorymethod;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct1();
    }
}
