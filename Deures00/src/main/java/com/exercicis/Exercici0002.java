package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Escriu el valor en Euros: ");
        String euros = scanner.next();
        double eurospun = Double.parseDouble(euros.replace(',','.'));

        System.out.print("Escriu la tasa de conversió (ex: 1.25): ");
        String conver = scanner.next();
        double conversió = Double.parseDouble(conver.replace(',','.'));

        double dollars = eurospun * conversió;
        System.out.printf(localeUS, "El valor de %.2f€ són %.2f$%n", eurospun, dollars);

        scanner.close();
    }
} 
