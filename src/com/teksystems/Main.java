package com.teksystems;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        loopOneToTen();
//        whileLoopTo100();
//        doWhileLoop();
//        loopMultiplesOfFive();
//        loopFivesLessThan50();
//        nestedLoop();
//        palindrome();
        nestedForLoopVar();
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

    public static void nestedLoop() {
        for (int week = 1; week < 3; ++week) {
            System.out.printf("Week: %d\n", week);
            for(int day = 1; day < 6; ++day) {
                System.out.printf("Day: %d\n", day);
            } //nested loop
            System.out.println();
        }//outer loop
    }//nestedLoop()

    public static void palindrome() {
        for (int i = 10; i < 200; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            StringBuilder rev = new StringBuilder();
            rev = sb.reverse();
            System.out.println(rev);
        }//for loop
    }//palindrome()

    public static void nestedForLoopVar() {
        for (int i = 1; i < 6; i++) {
            System.out.printf("Here's i %d\n", i);
            for(int j =1; j < 11; j++) {
                System.out.printf("Here's j: %d\n", j);
            }//inner for loop
            System.out.printf("Loop's run this many times: %d\n", i);
        }//outer for loop
    }//nestedForLoopVar()



} //Main
