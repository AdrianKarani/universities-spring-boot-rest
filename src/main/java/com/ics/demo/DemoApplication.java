package com.ics.demo;

import com.ics.demo.oop.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        /*
        Bird bird = new Bird("Chicken", TypeOfEye.COMPOUND,TypeOfBeak.BLUNT);

        Mammal mammal = new Mammal("Human", TypeOfEye.SIMPLE, 2, 9);

        Fish fish = new Fish("Tilapia", TypeOfEye.SIMPLE, 4);

        System.out.println(bird.toString());
        bird.move();

        System.out.println(mammal.toString());
        mammal.move();

        System.out.println(fish.toString());
        fish.move();
         */
    }

}
