package com.example.designpatterns.factory.abstractfactorymethod.factory;

import com.example.designpatterns.factory.abstractfactorymethod.product.Product1;
import com.example.designpatterns.factory.abstractfactorymethod.product.Product2;
import com.example.designpatterns.factory.abstractfactorymethod.product.ProductImpl11;
import com.example.designpatterns.factory.abstractfactorymethod.product.ProductImpl21;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Product1 newProduct1() {
        return new ProductImpl11();
    }

    @Override
    public Product2 newProduct2() {
        return new ProductImpl21();
    }
}
