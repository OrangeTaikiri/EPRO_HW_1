package org.lecture;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char option;

        do {
            System.out.println("""
                    Wählen Sie folgende Umrechnungs-Optionen aus:
                    a -> Kilometer in Meilen umrechnen
                    b -> Kilogramm in Pfund umrechnen
                    c -> Celsius in Fahrenheit
                    d -> eigene Umrechnung durchführen
                    x -> Programm beenden
                    """);

            option = scanner.next().charAt(0);

            if (option == 'x') {
                break;
            }

            System.out.println("Bitte geben Sie die zu konvertierende Menge an:");
            float value = scanner.nextFloat();

            if (option == 'a') {
                System.out.printf("%.2f km ergeben %.2f Meilen%n", value, value * 0.621371F);
            } else if (option == 'b') {
                System.out.printf("%.2f Kilo ergeben %.2f Pfund%n", value, value * 2.2046F);
            } else if (option == 'c') {
                System.out.printf("%.2f Celsius Grad ergeben %.2f Fahrenheit%n", value, (value * 9.0F / 5.0F) + 32);
            } else if (option == 'd') {
                System.out.println("Geben Sie Ausgangseinheit an:");
                String startUnit = scanner.next();
                System.out.println("Geben Sie Zieleinheit an:");
                String targetUnit = scanner.next();
                System.out.println("Bitte geben Sie den gewünschten Umrechnungsfaktor ein:");
                float factor = scanner.nextFloat();
                System.out.printf("%.2f %s ergeben %.2f %s%n", value, startUnit, value * factor, targetUnit);
            }

            System.out.println("Möchten Sie noch eine Einheit umrechnen? nein -> x");
            option = scanner.next().charAt(0);

        } while (option != 'x');

        scanner.close();
    }
}

