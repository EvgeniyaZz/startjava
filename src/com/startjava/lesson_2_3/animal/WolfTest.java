package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("мужской");
        wolfOne.setName("Клык");
        wolfOne.setWeight(9.8f);
        wolfOne.setAge(3);
        wolfOne.setColor("серый");

        System.out.println("gender : " + wolfOne.getGender());
        System.out.println("name : " + wolfOne.getName());
        System.out.println("weight : " + wolfOne.getWeight());
        System.out.println("age : " + wolfOne.getAge());
        System.out.println("color : " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}