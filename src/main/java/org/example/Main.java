package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        System.out.println("Inserisci due numeri:  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        double res;
        int val=-1;

        while(val !=4) {

            System.out.println("Inscerisci valore corrispondente ad operazione desiderata: \n" +
                    "0 per addizione, 1 sottrazione, 2 moltiplicazione, 3 divisione, 4 uscita");

            val = sc.nextInt();

            switch (val) {
                case 0:
                    res = Calculator.add(a, b);

                    System.out.println("Risultato: " + res);
                    break;
                case 1:
                    res = Calculator.sub(a, b);

                    System.out.println("Risultato: " + res);
                    break;
                case 2:
                    res = Calculator.mul(a, b);

                    System.out.println("Risultato: " + res);
                    break;
                case 3:
                    res = Calculator.div(a,b);

                    System.out.println("Risultato: " + res);

                    break;
                case 4:
                    System.out.println("Arrivederci!");

                    break;
                default:
                    System.out.println("Opzione non valida.");

            }

        }

    }
}

