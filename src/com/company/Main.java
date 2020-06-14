/*
 *
 * Interface: IGeometry
 *
 * 08 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 3
 *
 * Polymorphism
 * Create and implement two interfaces for your class
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Quadrat square = new Quadrat(5);

        System.out.println(square + "\n");
        System.out.println(square.toXML() + "\n");
        System.out.println(square.toJSON() + "\n");
        System.out.println(square.toConsole() + "\n");



    }
}
