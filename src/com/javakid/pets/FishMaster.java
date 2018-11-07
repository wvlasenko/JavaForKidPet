package com.javakid.pets;

public class FishMaster {
    public static void main(String[] args) {
        String fishReaction;
        Fish myFish = new Fish(20);
        myFish.dive(2);
        myFish.dive(10);
        myFish.dive(97);
        myFish.sleep();
        fishReaction= myFish.say("Hello");
        System.out.println(fishReaction);
    }
}
