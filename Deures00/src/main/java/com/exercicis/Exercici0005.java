package com.exercicis;

public class Exercici0005 {

    public static boolean isPalindrom(String text) {
        text = normalize(text);
        
        int lastLetter = text.length() - 1;
        String inverted = "";
        for (int cnt = lastLetter; cnt >= 0; cnt = cnt - 1) {
            String letter = String.valueOf(text.charAt(cnt));
            inverted = inverted + letter;
        }

        return text.equals(inverted);
    }

    public static String normalize(String text) {
        String rst = text.toLowerCase();
    
        String[] acento = {"à", "á", "è", "é", "í", "ò", "ó", "ú", "ù", " ", "'", "!", "\\.", ",", "·"};
        String[] sinacento = {"a", "a", "e", "e", "i", "o", "o", "u", "u", "", "", "", "", "", ""};
    
        for (int cnt = 0; cnt < acento.length; cnt++) {
            rst = rst.replaceAll(acento[cnt], sinacento[cnt]);
        }
        
        return rst;
    }
    
   
    public static void main(String[] args) {

        String[] exemples = {
            "Anul·la la lluna",
            "Atrapa la lluna",
            "Atrapa'l o l'aparta",
            "Aparta'l o atrapa'l",
            "No sap pas on",
            "On sap pas qui",
            "Tramaran anar a Mart",
            "A Mart trobaràn art",
            "Un pop nu",
            "Nu pop un"
        };

        for (String text : exemples) {
            boolean esPalindrom = isPalindrom(text);
            System.out.println(text + " (" + (esPalindrom ? "Si" : "No") + ")");
        }
    }
}
