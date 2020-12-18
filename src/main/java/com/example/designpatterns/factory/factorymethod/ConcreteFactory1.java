package com.example.designpatterns.factory.factorymethod;

public class ConcreteFactory1 extends AbsctractFactory{
    @Override
    Product newProduct() {
        return new ConcreteProduct1();
    }
}
