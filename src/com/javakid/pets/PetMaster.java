package com.javakid.pets;

public class PetMaster {
    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Мияу! Мияу!");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
