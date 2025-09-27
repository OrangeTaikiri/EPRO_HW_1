package org.lecture;

import java.util.Scanner;

public class Main {

    static void main() {

        //scanner for reading input value
        Scanner scanner = new Scanner(System.in);

        char option;
        //do-while for looping at least once
        do {

            float result = 0.0F;

            // using triple quotes to write more than one line
            System.out.println("""
                    Wählen sie folgende Umrechnungs-Optionen aus:
                    a -> Kilometer in Meilen umrechnen
                    b -> Kilogramm in Pfund umrechnen
                    c -> Celsius in Fahrenheit
                    d -> eigene Umrechnung druchführen 
                    x -> Programm beenden
                    """);

            option = scanner.next().charAt(0);

            if (option == 'x') {
                break;
            }


            System.out.println("Bitte geben sie die zu konvertierente Menge an");

            // input of the conversion Value
            float value = scanner.nextFloat();
            scanner.nextLine();

            // doing the conversion km to mi
            if (option == 'a') {
                System.out.printf("%.2f km ergeben %.2f Meilen\n", value, value * 0.621371F);
            }

            // doing the conversion Kilo to Pound
            if (option == 'b') {
                System.out.printf("%.2f Kilo ergeben %.2f Pfund\n", value, value * 2.2046F);
            }

            // doing the conversion celsius to fahrenheit
            if (option == 'c') {
                System.out.printf("%.2f Celsius Grad ergeben %.2f Fahrenheit\n", value, (value * 9 / 5) + 32);
            }

            // doing the custom conversion
            if (option == 'd') {
                System.out.println("Geben sie Ausgangseinheit an");
                String startUnit = scanner.next();
                System.out.println("Geben sie Zieleinheit an");
                String targetUnit = scanner.next();
                System.out.println("Bitte geben Sie den gewünschten Umrechnungsfaktor ein:");
                float factor = scanner.nextFloat();
                System.out.printf("%.2f %s ergeben %.2f %s ", value, startUnit,  value * factor, targetUnit);
            }

            System.out.println("Möchten Sie noch eine Einheit umrechnen? nein -> x");
            option = scanner.next().charAt(0);

        }
        while (option != 'x');
    }

}
