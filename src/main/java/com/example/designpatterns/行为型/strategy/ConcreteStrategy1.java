package com.example.designpatterns.行为型.strategy;

public class ConcreteStrategy1 extends Strategy {
    @Override
    protected void strategyMethod() {
        System.out.println("策略1方法执行");
    }
}
