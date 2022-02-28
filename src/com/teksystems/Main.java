package com.teksystems;

public class Main {
    public static void main(String[] args) {
//        loopOneToTen();
//        whileLoopTo100();
//        doWhileLoop();
//        loopMultiplesOfFive();
        loopFivesLessThan50();
    } //main

    public static void loopOneToTen() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }//for loop
    } //loopOneToTen()

    public static void whileLoopTo100() {
        int count = 10;
        while (count < 110) {
            System.out.println(count);
            count += 10;
        } //while loop
    } //whileLoopTo100();

    public static void doWhileLoop() {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 11);
    }//doWhileLoop()

    public static void loopMultiplesOfFive() {
        for (int i = 0; i < 101; i++) {
            if (i % 5 == 0 && (i < 25 | i > 75))
            System.out.println(i);
        }//for loop
    } //loopMultiplesOfFive()

    public static void loopFivesLessThan50() {
        for (int i = 0; i < 101; i++) {
            if (i % 5 == 0)
                System.out.println(i);
            if (i > 50)
                break;
        }//for loop
        System.out.println("You're done son!");
    }//loopFivesLessThan50()

    public static void

} //Main
