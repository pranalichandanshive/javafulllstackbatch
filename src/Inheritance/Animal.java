package Inheritance;

import java.sql.SQLOutput;

public class Animal {
    void eat() {
        System.out.println("Animal can eat e]anything");
    }

}
    class Dog extends Animal {
        void run() {
            System.out.println("Dog run everywere");
        }
    }

    class BabyDog extends Dog {
        void sleep() {
            System.out.println("only sleep @ night");
        }
    }

    class AnimalImpl{
        public static void main(String[] args) {
            BabyDog babyDog =new BabyDog();
            babyDog.sleep();
            babyDog.run();
            babyDog.eat();

        }
    }
