package com.example.designpatterns.factory.factorymethod;

public class ConcreteFactory2 extends AbsctractFactory{
    @Override
    Product newProduct() {
        return new ConcreteProduct2();
    }
}
