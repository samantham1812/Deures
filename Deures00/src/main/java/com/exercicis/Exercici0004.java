package com.exercicis;

import java.util.Scanner;

public class Exercici0004 {

    public static int contaMajuscules(String contrasenya) {
        int cont = 0;
        for (char c : contrasenya.toCharArray()) {
            if (Character.isUpperCase(c)) {
                cont++;
            }
        }
        return cont;
    }

    public static int contaMinuscules(String contrasenya) {
        int cont = 0;
        for (char c : contrasenya.toCharArray()) {
            if (Character.isLowerCase(c)) {
                cont++;
            }
        }
        return cont;
    }

    public static String validaContrasenya(String contrasenya) {
        if (contrasenya.length() >= 8 &&
            contaMajuscules(contrasenya) >= 2 &&
            contaMinuscules(contrasenya) >= 2){
            return "La contrasenya és vàlida";    
        } else {
            return "La contrasenya NO és vàlida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Escriu una contrasenya: ");
        String contrasenya = scanner.nextLine();

        String resultado = validaContrasenya(contrasenya);

        System.out.printf("La contrasenya '%s': %s\n", contrasenya, resultado);

        scanner.close();
    }
}