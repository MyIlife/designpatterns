package com.example.designpatterns.factory.abstractfactorymethod.factory;

import com.example.designpatterns.factory.abstractfactorymethod.product.*;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Product1 newProduct1() {
        return new ProductImpl12();
    }

    @Override
    public Product2 newProduct2() {
        return new ProductImpl22();
    }
}
