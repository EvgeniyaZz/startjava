package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();

        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.25f);
        jaeger1.setWeight(1.98f);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 8, 6);

        System.out.println("Модели: " + jaeger1.getModelName() + " и " + jaeger2.getModelName());
        System.out.println(jaeger1);
        System.out.println(jaeger2);

        if(jaeger1.getOrigin() == jaeger2.getOrigin()) {
            System.out.println("Роботы произведены в одной стране");
        } else {
            System.out.println("Роботы произведены в разных странах");
        }

        if(jaeger1.getStrength() > jaeger2.getStrength()) {
            System.out.println(jaeger1.getModelName() + " сильнее, чем " + jaeger2.getModelName());
        } else if(jaeger1.getStrength() < jaeger2.getStrength()) {
            System.out.println(jaeger2.getModelName() + " сильнее, чем " + jaeger1.getModelName());
        } else {
            System.out.println("Сила роботов одинаковая");
        }

        jaeger1.move();
    }
}