package com.example.designpatterns.行为型.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClass1();
        AbstractClass b = new ConcreteClass2();
        a.TemplateMethod();;
        b.TemplateMethod();
    }
}
