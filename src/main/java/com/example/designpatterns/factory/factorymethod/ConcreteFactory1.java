package com.example.designpatterns.factory.factorymethod;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct1();
    }
}
