package com.company;

public class watermelon extends fructs {
    private String type;


    public String getType() {
        return type;
    }

    public int getColichestvo() {
        return colichestvo;
    }

    public void upal(String padaet) {
        System.out.println(padaet);
    }

    public watermelon(Vkus vkus, int colichestvo, String type) {
        super(vkus);
        this.colichestvo = colichestvo;
        this.type = type;
    }

    public void upal(String padaet, int shet) {
        for (int i = 0; i < shet; i++) {
            System.out.println(padaet);

        }
        System.out.println(padaet);
    }

    private int colichestvo;


    public String getInfo() {
        return "\nВкусный: " + this.getVkus() + "\nТип: " + this.getType();
    }
}

