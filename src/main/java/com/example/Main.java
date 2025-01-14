package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Unit marine = new Unit("marine", 20, 6, "Terran Unit");
        Unit Zealot = new Unit("Zealot", 30, 8, "Protoss Unit");
        Unit Zergling = new Unit("Zergling", 15, 5, "Zerg Unit");
        marine.printUnitInfo();
        Zealot.printUnitInfo();
        Zergling.printUnitInfo();

        marine.Move("right");

    }
}