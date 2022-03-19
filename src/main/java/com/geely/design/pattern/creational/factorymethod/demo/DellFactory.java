package com.geely.design.pattern.creational.factorymethod.demo;

public class DellFactory extends PcFactory {
    @Override
    DellMouse createMouse() {
        return new DellMouse();
    }

    @Override
    DellKeybo createKeybo() {
        return new DellKeybo();
    }
}
