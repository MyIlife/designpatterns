package com.example.designpatterns.创建型.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        AbstractFactory a = new ConcreteFactory1();//可引入配置文件和反射机制实现
        Product product = a.newProduct();
        product.show();
    }
}
