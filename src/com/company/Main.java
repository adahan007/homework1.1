package com.company;

public class Main {

    public static void main(String[] args) {
        Limon limon = new Limon(Vkus.KISLYI, "limon");
        System.out.println(limon.getInfo());
        limon.vkusnyi();
        limon.eating("Хавает");
        watermelon watermelon = new watermelon(Vkus.SLADKIY, 5, "Arbus");
        System.out.println(watermelon.getInfo());
        watermelon.upal("Арбузы покатились", 5);


    }
}