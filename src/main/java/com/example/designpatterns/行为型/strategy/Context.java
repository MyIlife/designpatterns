package com.example.designpatterns.行为型.strategy;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static Map<String,Strategy> strategyMap = new HashMap<>();
    static{
        strategyMap.put("strategy1",new ConcreteStrategy1());
        strategyMap.put("strategy2",new ConcreteStrategy2());
    }
    public static void runStrategyMethod(String method){
        strategyMap.get(method).strategyMethod();
    }
}
