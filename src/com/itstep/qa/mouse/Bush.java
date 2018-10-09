package com.itstep.qa.mouse;

import java.util.Random;

public class Bush {
    private int a;
    private int b;
    private String color;

    public Bush (int a, int b, String color){
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public void a (){
        Random random = new Random();
        a = random.nextInt(99);
    }
    public void b (){
        Random random = new Random();
        b = random.nextInt(99);
    }
    public void setColor (String color){
        this.color = color;
    }
}
