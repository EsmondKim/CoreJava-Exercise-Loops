package com.teksystems;

public class Main {
    public static void main(String[] args) {
//        loopOneToTen();
        whileLoopTo100();
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



} //Main
