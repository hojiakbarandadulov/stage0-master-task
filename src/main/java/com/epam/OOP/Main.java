package com.epam.OOP;

public class Main {
    public static void main(String[] args) {

//        Animal dog = new Animal("brown", 4, true);
//        Animal cat = new Animal("gray", 4, true);
//        Animal snake = new Animal("green", 0, false);


        Bird bird = new Bird();
        Dog dog = new Dog();

      /*  System.out.println(dog.getDescription());
        System.out.println(cat.getDescription());
        System.out.println(snake.getDescription());*/
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
