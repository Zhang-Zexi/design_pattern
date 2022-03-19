package com.geely.design.pattern.creational.factorymethod.demo;

public class HpFactory extends PcFactory {
    @Override
    HpMouse createMouse() {
        return new HpMouse();
    }

    @Override
    HpKeybo createKeybo() {
        return new HpKeybo();
    }
}
