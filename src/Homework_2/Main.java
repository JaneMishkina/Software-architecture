package Homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openRewgard();
//        generator = new GoldGenerator();
//        generator.openRewgard();


        ItemFabric generator = new GoldGenerator();
        generator.openRewgard();
        generator = new GemGenerator();
        generator.openRewgard();
        //System.out.println("Hello, World!");

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new AppleGenerator());

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt() % fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openRewgard();
        }
    }
}