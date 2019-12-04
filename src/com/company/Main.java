package com.company;


public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.start();

        for (int i = 0; i < 10; i++) {
            bicycle.accelerate();
        }
        for (int i = 0; i < 5; i++) {
            bicycle.pressBreak();
        }
        for (int i = 0; i < 5; i++) {
            bicycle.accelerate();
        }
        bicycle.stop();
    }
}

