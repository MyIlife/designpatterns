package com.example.designpatterns.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(SimpleFactory.P1);
        product.show();
    }
}
