package com.company;

import java.util.Random;

public class Limon extends fructs {
    private String type;

    public Limon(Vkus vkus, String type) {
        super(vkus);
        this.type = type;

    }

    public String getType() {
        return type;
    }


    public void eating(String eat) {
        System.out.println(eat);
    }

    public final void vkusnyi() {
        Random random = new Random();
        int nomer = random.nextInt(2);
        if (nomer == 0) {
            System.out.println("Вкусный");
        }
        if (nomer == 1) {
            System.out.println("Не вкусный");
        }

    }

    public String getInfo() {
        return "Vkus : " + getVkus() +
                "\n type: " + getType();
    }
}