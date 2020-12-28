package com.example.designpatterns.创建型.factory.abstractfactorymethod.factory;

import com.example.designpatterns.创建型.factory.abstractfactorymethod.product.Product1;
import com.example.designpatterns.创建型.factory.abstractfactorymethod.product.Product2;

public abstract class AbstractFactory {
    public abstract Product1 newProduct1();
    public abstract Product2 newProduct2();
}
