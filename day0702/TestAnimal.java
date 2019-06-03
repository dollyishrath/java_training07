package com.trimindtech.training.day07.day0702;

import com.trimindtech.training.day07.day0702.Animal;
import com.trimindtech.training.day07.day0702.BigDog;
import com.trimindtech.training.day07.day0702.Cat;
import com.trimindtech.training.day07.day0702.Dog;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        Animal animal1 = new Cat();//downcast
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();

        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal2;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
