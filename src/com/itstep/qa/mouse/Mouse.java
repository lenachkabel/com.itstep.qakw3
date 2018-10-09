package com.itstep.qa.mouse;

public class Mouse {
    private int x1;
    private int x2;
    private double y1;
    private double y2;
    private String name;
    private String color;

    public int getX1() { return x1; }

    public void setX1(int x1) { this.x1 = x1; }

    public int getX2() { return x2; }

    public void setX2(int x2) { this.x2 = x2; }

    public Mouse (int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
    }
    public Mouse (double y1y1, double y2y2){
        y1 += y1y1+1;
        y2 += y2y2+1;
        y1 +=y1y1+5;
        y2 +=y2y2+5;
    }

    public double getY1() { return y1; }

    public void setY1(double y1) { this.y1 = y1; }

    public double getY2() { return y2; }

    public void setY2(double y2) { this.y2 = y2; }

    public void setName (String name){
        this.name = name;
    }
    public void setColor (String color){
        this.color = color;
    }

    public String getName() { return name; }

    public String getColor() { return color; }

    public void print(){
        System.out.println(y1 +y2 );

    }
    public Mouse (double y1, double y2, String color){
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
    }




}
