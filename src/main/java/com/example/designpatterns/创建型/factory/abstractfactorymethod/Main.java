package com.example.designpatterns.创建型.factory.abstractfactorymethod;

import com.example.designpatterns.创建型.factory.abstractfactorymethod.factory.AbstractFactory;
import com.example.designpatterns.创建型.factory.abstractfactorymethod.factory.ConcreteFactory1;
import com.example.designpatterns.创建型.factory.abstractfactorymethod.product.Product1;

public class Main {
    public static void main(String[] args) {
        AbstractFactory a = new ConcreteFactory1();
        Product1 product1 = a.newProduct1();
        product1.show();
    }
}
