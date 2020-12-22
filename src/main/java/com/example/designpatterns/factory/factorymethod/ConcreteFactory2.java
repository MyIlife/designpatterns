package com.example.designpatterns.factory.factorymethod;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }
}
