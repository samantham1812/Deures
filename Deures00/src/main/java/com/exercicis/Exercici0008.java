package com.exercicis;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercici0008 {

    public static ArrayList<Integer> generaImparells(int num) {
        ArrayList<Integer> imparells = new ArrayList<>();
        
        for (int i = 3; i <= num; i += 2) {
            imparells.add(i);
        }
        return imparells;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        int num = scanner.nextInt();

        if (num <= 2) {
            System.out.println("No hi ha nombres imparells entre 2 i " + num);
        } else {
            ArrayList<Integer> imparells = generaImparells(num);
            System.out.println("Nombres imparells entre 2 i " + num + ": " + imparells);
        }

        scanner.close();
    }
}

