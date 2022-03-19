package com.geely.design.pattern.creational.factorymethod.demo;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        PcFactory pcFactory = new DellFactory();
        Keybo keybo = pcFactory.createKeybo();
        Mouse mouse = pcFactory.createMouse();
        keybo.sayHi();
        mouse.sayHi();
    }
}
