package com.company;

public class fructs {
    private Vkus vkus;
    public fructs(Vkus vkus) {
        this.vkus = vkus;
    }

    public Vkus getVkus() {
        return vkus;
    }


    public String getInfo() {
        return "\nВкусный?" + this.getVkus() + "\nТип: " ;
    }

}


