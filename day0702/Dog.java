package com.trimindtech.training.day07.day0702;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("woof");
    }
    public void greeting(Dog another){
        System.out.println("wooooooof");
    }
}
