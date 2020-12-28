package com.example.designpatterns.行为型.strategy;

public class ConcreteStrategy2 extends Strategy {
    @Override
    protected void strategyMethod() {
        System.out.println("策略2方法执行");
    }
}
