package com.javakid.pets;

public class Fish extends Pet {
    int currentDepth = 0;
    Fish (int startingPosition){
        currentDepth=startingPosition;
    }

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка" + " Я не могу плавать так глубоко ");
            currentDepth = currentDepth - howDeep;

        } else {
            System.out.println("Ныряю еще на " + howDeep + " Метров ");
            System.out.println("Я на глубине " + currentDepth + " Метров ниже уровня моря ");

        }
            return currentDepth;
        }
        public String say (String something ) {
            return "Рыбы не говорят";
        }
    }
