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

import java.util.Objects;

public class Quadrat implements iGeometry, iPackaging {

    private int sideA;

    // 1. Constructor for class Quadrat

    public Quadrat() {
    }

    public Quadrat(int sideA) {
        this.sideA = sideA;
    }

    //  Getters/Setters for class Quadrat

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }


    // Methods for class Quadrat

    // Method getArea() for class Quadrat
    @Override
    public double getArea() {
        return this.getSideA() * 4;

    }

    // Method getLinearLength() for class Quadrat

    @Override
    public double getLinearLength() {
        return 2 * (this.getSideA() * 2);
    }

    // Method toJSON() for class Quadrat

    @Override
    public String toJSON() {
        String json = "Quadrat {"
                + "\""  + "sideA\": " + this.getSideA()
                + ", "
                + "\""  + "linearLength\": " + this.getLinearLength()
                + ", "
                + "\""  + "area\": " + this.getArea()
                + "}";
        return json;
    }

    // Method toXML() for class Quadrat

    @Override
    public String toXML() {
        String xml = "<Quadrat>"
                + "<sideA>" + this.getSideA() + "</SideA>"
                + "<linearLength>" + this.getLinearLength() + "</linearLength>"
                + "<area>" + this.getArea() + "</area>"
                +  "</Quadrat>";
        return xml;
    }

    // Method toConsole() for class Quadrat

    @Override
    public String toConsole() {
        return "Quadrat {" + "\n" +
                "Side A = " + this.getSideA() + "," + "\n" +
                "Linear Length = " + this.getLinearLength() + "," + "\n" +
                "Area = " + this.getArea() +
                '}';
    }

    // Method toString() for class Quadrat

    @Override
    public String toString() {
        return "Quadrat {" +
                "SideA = " + this.getSideA() +
                ", Linear Length = " + this.getLinearLength() +
                ", Area = " + this.getArea() +
                '}';
    }

}


