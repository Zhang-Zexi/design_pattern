package com.geely.design.pattern.creational.factorymethod.demo;

public class HpMouseFactory extends MouseFactory {
    @Override
    Mouse createMouse() {
        return new HpMouse();
    }
}
