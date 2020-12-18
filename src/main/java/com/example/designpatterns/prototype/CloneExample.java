package com.example.designpatterns.prototype;

public class CloneExample implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample c = new CloneExample();
        CloneExample c1 = (CloneExample)c.clone();
        System.out.println("c==c1?"+(c==c1));
    }
}
