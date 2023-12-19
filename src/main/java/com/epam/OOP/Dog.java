package com.epam.OOP;

public class Dog extends Animal{

    public Dog() {
      super("brown",4,true);
    }
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
