package com.geely.design.pattern.creational.factorymethod.demo;

public class Test {

    public static void main(String[] args) {
        MouseFactory factory = new DellMouseFactory();
        Mouse mouse = factory.createMouse();
        mouse.sayHi();
    }
}
