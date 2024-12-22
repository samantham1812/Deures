package com.exercicis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercici0011 {

    public static ArrayList<String> escullNomsAleatoris(ArrayList<String> noms, int quantitat) {
        
        if (quantitat > noms.size()) {
            throw new IllegalArgumentException("La quantitat no pot ser més gran que " + noms.size() + ".");
        }
    
        ArrayList<String> seleccionats = new ArrayList<>();
        Random random = new Random();

        ArrayList<String> noms2 = new ArrayList<>(noms); 
        for (int i = 0; i < quantitat; i++) {
            if (noms2.isEmpty()) break;
            int index = random.nextInt(noms2.size());
            seleccionats.add(noms2.remove(index));
        } /* dupli */
        return seleccionats;
    }
   
    public static ArrayList<String> nomsAcabenVocal(ArrayList<String> noms) {
        ArrayList<String> resultat = new ArrayList<>();
        for (String nom : noms) {
            char ultimaLletra = nom.toLowerCase().charAt(nom.length() - 1);
            if ("aeiou".indexOf(ultimaLletra) >= 0) {
                resultat.add(nom);
            }
        } /* fin vocal */
        return resultat;
    }

    public static ArrayList<String> nomsCompostos(ArrayList<String> noms) {
        ArrayList<String> resultat = new ArrayList<>();
        for (String nom : noms) {
            if (nom.contains(" ")) {
                resultat.add(nom);
            }
        } /* compu */
        return resultat;
    }

    public static void main(String[] args) {

        ArrayList<String> noms = new ArrayList<>(Arrays.asList(
            "Mario", "Princess Peach", "Wario", "Luigi", "Iggy Koopa", "Toad", "Yoshi", "Donkey Kong", "Birdo"
        )); /* arr con lis */

        ArrayList<String> nomsAleatoris = escullNomsAleatoris(noms, 5);
        System.out.println("Noms escollits a l'atzar: " + nomsAleatoris); /* aleat */

        try {
            ArrayList<String> seleccionatsError = escullNomsAleatoris(noms, 25);
            System.out.println("Noms escollits: " + seleccionatsError);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        ArrayList<String> nomsVocal = nomsAcabenVocal(noms);
        System.out.println("Noms que acaben amb vocal: " + nomsVocal); /* fin vocal nom */

        ArrayList<String> nomsCompostos = nomsCompostos(noms);
        System.out.println("Noms compostos: " + nomsCompostos); /* nom compu */
    }
}