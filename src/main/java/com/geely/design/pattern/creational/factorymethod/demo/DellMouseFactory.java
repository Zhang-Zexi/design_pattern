package com.geely.design.pattern.creational.factorymethod.demo;

public class DellMouseFactory extends MouseFactory {
    @Override
    Mouse createMouse() {
        return new DellMouse();
    }
}
