package com.javakid.pets;

import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep() {
        System.out.println("Спокойной ночи ! До завтра !");
    }

    public void eat() {
        System.out.println("Я очень голоден, давайте перекусим");
    }

    public String say(String aWord) {
        String petResponce = "Ну ладно !! " + aWord;
        return petResponce;
    }
}
