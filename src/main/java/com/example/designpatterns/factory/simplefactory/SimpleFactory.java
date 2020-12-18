package com.example.designpatterns.factory.simplefactory;

public class SimpleFactory {
    public static final String P1 = "ConcreteProduct1";
    public static final String P2 = "ConcreteProduct2";
    public static Product makeProduct(String type){
        switch (type){
            case P1:
                return new ConcreteProduct1();
            case P2:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}
