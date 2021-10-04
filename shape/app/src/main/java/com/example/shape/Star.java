package com.example.shape;

public class Star extends Shape{
    private int x;
    private int y;
    String color;
    public Star(int x, int y, String color) {
        super(x,y);
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
