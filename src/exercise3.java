/**
 * Created by Rackenrotz on 26.04.15.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise3 {

    // 10.1
    // Ganze Zahl zu Gleitkommazahl nach Subtraktion
    public void intTodouble(int a, int b) {

        double c = (double) a / b;

        System.out.println(c);
    }


    // 10.2
    public void doubleToint(double a, double b) {

        int c = (int) (a * b);

        double d = a * b;
        System.out.println(c);

        int afterPoint = (int) (d * 100) % 100;
        String a1 = (String) "0." + afterPoint;
        System.out.println(a1);

    }

    // 11.1
    public void sortOfthree(int a, int b, int c) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        if (a <= b && a <= c && b <= c) {
            arrlist.add(a);
            arrlist.add(b);
            arrlist.add(c);

        }

        if (a <= b && a <= c && b >= c) {
            arrlist.add(a);
            arrlist.add(c);
            arrlist.add(b);

        }

        if (a >= b && a <= c && b <= c) {
            arrlist.add(b);
            arrlist.add(a);
            arrlist.add(c);

        }

        if (a >= b && a >= c && b <= c) {
            arrlist.add(b);
            arrlist.add(c);
            arrlist.add(a);

        }

        if (a >= b && a >= c && b >= c) {
            arrlist.add(c);
            arrlist.add(b);
            arrlist.add(a);

        }

        if (a <= b && a >= c && b >= c) {
            arrlist.add(c);
            arrlist.add(a);
            arrlist.add(b);

        }
        System.out.println(arrlist);

    }

    // 11.2
    public void AndNot(int a, int b) {

        if (a == 42 && b != 42 || a != 42 && b == 42) {

            System.out.println("Das ist die Antwort");

        } else {
            System.out.println("Die Richtige Zahl ist nicht dabei !");
        }
    }

    // 12.1
    public void ticketPrice(int age) {
        int ticketPrice = 20;
        if (age <= 16 && age >= 1) {
            ticketPrice = 10;
        }
        System.out.println(ticketPrice);
    }

    // 12.2
    public void sortDesicion(int a, int b, int c) {

        String sortDecision = ((a <= b && b <= c) ? "aufsteigend sortiert"
                : "nicht sortiert");
        System.out.println(sortDecision);
    }

    // 13
    public void loop() {

        for (int id = 20; id > 0; id -= 2) {
            System.out.println(id);
        }

        System.out.println(" ");

        int id = 20;
        while (id > 0) {
            System.out.println(id);
            id -= 2;

        }

        System.out.println(" ");

        int id2 = 20;
        do {

            System.out.println(id2);

            id2 -= 2;

        } while (id2 > 0);

    }

    // 14.1

    public void wochentage() {

        Scanner scan = new Scanner(System.in);
        System.out
                .println("Bitte eine ganze Zahl f�r Wochentag von 1 bis 7 eingeben: ");

        int day;
        do {

            day = scan.nextInt();
            if (day < 1 || day > 7) {
                System.out
                        .println("Eingegebene Zahl liegt nicht im Wertebereich");
            }

        } while (day < 1 || day > 7);

        switch (day) {
            case 1:
                System.out.println("Montag");

                break;
            case 2:
                System.out.println("Dienstag");

                break;
            case 3:
                System.out.println("Mittwoch");

                break;
            case 4:
                System.out.println("Donnerstag");

                break;
            case 5:
                System.out.println("Freitag");

                break;
            case 6:
                System.out.println("Samstag");

                break;
            case 7:

                System.out.println("Sonntag");
                break;

        }

    }
    // 14.2

    public void wochentage2() {
    }

    // 15.1
    public void BMI() {

        // Zuerst die K�rpergr��e
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Bitte K�rpergr��e in Meter Eingeben: ");
        double high = scanner1.nextDouble();

        // Dann das Gewicht
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte Gewicht in kg Eingeben: ");
        double weight = scanner2.nextDouble();

        // Zuletzt BMI
        double bmi = (weight / (high * high));
        System.out.println("Ihr BMI: " + bmi);

        // Zuordnung in welche Kategorie man f�llt
        if (bmi < 18.5) {
            System.out.println("Sie haben Untergewicht");
        }
        if (bmi <= 24.9 && bmi >= 18.5) {
            System.out.println("Sie haben Normalgewicht");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("Sie haben �bergewicht");
        }
        if (bmi > 30 && bmi < 40) {
            System.out.println("Sie haben starkes �bergewicht");
        }
        if (bmi > 40) {
            System.out.println("Sie haben Extreme Adipositas");
        }
    }

    // 15.2

    public void dhl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pakte Gewicht in Gramm eingeben: ");
        double weight = scanner.nextDouble();

        System.out.println("Paketl�nge in cm eingeben: ");
        double length = scanner.nextDouble();

        System.out.println("Paketbreite in cm eingeben: ");
        double width = scanner.nextDouble();

        System.out.println("Pakettiefe in cm eingeben: ");
        double depth = scanner.nextDouble();

        if (weight <= 2000 && length <= 60 && width <= 30 && depth <= 15) {
            System.out.println("Filialpreis:     4,99 �");
            System.out.println("Onlinepreis :     4,99 �");
        } else {
            if (weight <= 6000 && length <= 120 && width <= 60 && depth <= 60) {
                System.out.println("Filialpreis:     6,99 �");
                System.out.println("Onlinepreis:     5,99 �");
            } else {
                if (weight <= 10000 && weight > 6000 && length <= 120
                        && width <= 60 && depth <= 60) {
                    System.out.println("Filialpreis:     8,49 �");
                    System.out.println("Onlinepreis:     7,49 �");
                } else {
                    if (weight > 10000 && weight <= 31500 && length <= 120
                            && width <= 60 && depth <= 60) {
                        System.out.println("Filialpreis:     14,99 �");
                        System.out.println("Onlinepreis:     13,99 �");
                    }
                }
            }
        }
    }

    // 15.3
    public void currency() throws NumberFormatException, Exception {

        double cursDollar = Double.parseDouble(getCurs());
        System.out
                .println("Bitte geben Sie die W�hrung an in die gewechselt werden soll: USD f�r USD -> EUR und EUR f�r USD -> EUR");
        Scanner scan = new Scanner(System.in);
        String currency = scan.next();
        System.out.println("Bitte geben Sie ihren Geldbetrag ein:");
        double money = scan.nextDouble();
        if (currency.equals("EUR")) {
            double toEuro = money * cursDollar;
            System.out.println("Sie erhalten: " + toEuro + " Euro");
        } else if (currency.equals("USD")) {
            double toDollar = money / cursDollar;
            System.out.println("Sie erhalten: " + toDollar + " Euro");
        } else {
            System.out.println("Weder EUR noch USD eingegeben");
        }
    }

    // 16.1
    public void dez(int number) {

        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("null");
        arrlist.add("ein");
        arrlist.add("zwei");
        arrlist.add("drei");
        arrlist.add("vier");
        arrlist.add("f�nf");
        arrlist.add("sechs");
        arrlist.add("sieben");
        arrlist.add("acht");
        arrlist.add("neun");
        arrlist.add("zehn");
        arrlist.add("elf");
        arrlist.add("zw�lf");
        arrlist.add("zwanzig");
        arrlist.add("drei�ig");
        arrlist.add("sechzig");
        arrlist.add("siebzig");

        if (number == 1) {
            System.out.print(arrlist.get(number) + "s");
        }

        else if ((number >= 0 && number <= 12 && number != 1) || number == 20) {
            System.out.print(arrlist.get(number));
        }

        else if (number == 30) {
            System.out.print(arrlist.get(14));
        } else if (number == 60) {
            System.out.print(arrlist.get(15));
        } else if (number == 70) {
            System.out.print(arrlist.get(16));
        } else if (number >= 13 && number < 20) {
            System.out.print(arrlist.get(number % 10) + "zehn");
        } else if (number > 20 && number < 30) {
            System.out
                    .print(arrlist.get(number % 10) + "und" + arrlist.get(13));
        } else if (number > 30 && number < 100 && number % 10 == 0
                && number >= 70 && number <= 60) {
            System.out.print(arrlist.get(number / 10) + "zig");
        } else if (number > 30 && number < 100 && number % 10 != 0
                && number >= 79 || number <= 60) {
            System.out.print(arrlist.get(number % 10) + "und"
                    + arrlist.get(((number - (number % 10)) / 10)) + "zig");
        } else if (number <= 79 && number >= 70) {
            System.out
                    .print(arrlist.get(number % 10) + "und" + arrlist.get(16));
        } else if (number <= 39 && number >= 30) {
            System.out
                    .print(arrlist.get(number % 10) + "und" + arrlist.get(14));
        } else if (number <= 69 && number >= 60) {
            System.out
                    .print(arrlist.get(number % 10) + "und" + arrlist.get(15));
        } else if (number > 99 && number < 1000 && number % 100 == 0) {
            System.out.print(arrlist.get(number / 100) + "hundert");
        } else if (number > 99 && number < 1000 && number % 100 != 0) {
            System.out.print(arrlist.get(number / 100) + "hundert");
            number = number % 100;
            dez(number);
        }

    }

    // 16.2
    public void gleitkomma(double number) {

        int round = (int) number;

        ArrayList<String> arrlist = new ArrayList<String>();
        String cast = Double.toString(number);
        String temp;
        int after = 0;
        int count = 0;
        for (int i = 0; i < cast.length(); i++) {
            temp = cast.substring(i, i + 1);
            if (temp.equals(".")) {
                count = 0;
            } else {
                count++;
            }

        }

        for (int i = 1; i <= count; i++) {
            after = (int) Math.pow(10, i);
        }

        System.out.println(cast);
        int afterPoint = (int) (number * after) % after;
        String noInt = Integer.toString(afterPoint);

        for (int i = 0; i < noInt.length(); i++) {
            String letter = String.valueOf(noInt.charAt(i));
            arrlist.add(letter);

        }
        ArrayList<String> arrlist2 = new ArrayList<String>();
        arrlist2.add("null");
        arrlist2.add("ein");
        arrlist2.add("zwei");
        arrlist2.add("drei");
        arrlist2.add("vier");
        arrlist2.add("f�nf");
        arrlist2.add("sechs");
        arrlist2.add("sieben");
        arrlist2.add("acht");
        arrlist2.add("neun");

        dez(round);
        System.out.print(" Komma ");

        for (int i = 0; i < arrlist.size(); i++) {

            System.out.print(arrlist2.get(Integer.valueOf(arrlist.get(i)))
                    + " ");
        }

    }

    // 17.1
    public void intToRom(int number) {

        if (number >= 1000) {
            System.out.print("M");
            intToRom(number - 1000);

        } else if (number >= 500 && number < 999) {
            System.out.print("D");
            intToRom(number - 500);

        } else if (number >= 100 && number < 500) {
            System.out.print("C");
            intToRom(number - 100);

        } else if (number >= 50 && number < 100) {
            System.out.print("L");

            intToRom(number - 50);
        } else if (number >= 40 && number < 60) {
            System.out.print("XL");
            intToRom(number - 40);

        } else if (number >= 10 && number < 40) {
            System.out.print("X");
            intToRom(number - 10);

        } else if ((number == 5)) {
            System.out.print("V");
            intToRom(number - 5);

        } else if (number % 5 == 4 || number % 5 == 9) {
            if (number % 10 == 4) {
                System.out.print("|V");
                intToRom(number - 4);
            } else {
                if (number % 10 == 9) {
                    System.out.print("|");
                    intToRom(number + 1);
                }
            }
        } else if (number % 5 != 0 && number % 5 != 4) {
            System.out.print("|");
            intToRom(number - 1);
        }

    }

    // 17.2
    int counter = 0;

    public void romToInt(String rom) {
        ArrayList<String> arr3 = new ArrayList<String>();

        String noSpace = rom.replaceAll("\\s+", "");
        for (int i = 0; i < noSpace.length(); i++) {
            String letter = String.valueOf(noSpace.charAt(i));
            arr3.add(letter);

        }

        for (int j = 0; j <= arr3.size(); j++) {

            if (j < arr3.size() - 1 && arr3.get(j).equals("X")
                    && arr3.get(j + 1).equals("L")) {
                arr3.set(j, "XL");
                arr3.remove(j + 1);
            }

            if (j < arr3.size() - 2 && arr3.size() > 1) {

                if (arr3.get(j).equals("|")) {
                    counter = counter + 1;
                }

                if (arr3.get(j).equals("V")) {
                    counter = counter + 5;
                }
                if (arr3.get(j).equals("X")) {
                    counter = counter + 10;
                }
                if (arr3.get(j).equals("XL")) {
                    counter = counter + 40;
                }
                if (arr3.get(j).equals("L")) {
                    counter = counter + 50;
                }
                if (arr3.get(j).equals("C")) {
                    counter = counter + 100;
                }
                if (arr3.get(j).equals("D")) {
                    counter = counter + 500;
                }
                if (arr3.get(j).equals("M")) {
                    counter = counter + 1000;

                }
            }
            if (j == arr3.size() - 2 && arr3.get(j).equals("|")) {
                if (arr3.get(j + 1).equals("|")) {
                    counter = counter + 2;
                }
                if (arr3.get(j + 1).equals("X")) {
                    counter = counter + 9;
                }
                if (arr3.get(j + 1).equals("V")) {
                    counter = counter + 4;
                }
            }

        }

        System.out.println(counter);

    }

    // 18.1
    public void isPrim(int prim) {
        // neue prim
        Boolean test = false;
        for (int i = 0; i < primFactor3(prim).size(); i++) {

            if (prim == primFactor3(prim).get(i)) {
                test = true;

            } else {
                test = false;

            }
        }
        if (test == true) {
            System.out.println(prim + " ist eine Primzahl!");
        } else {
            System.out.println(prim + "ist keine Primzahl");
        }
    }

    // 18.2
    ArrayList<Integer> arr4 = new ArrayList<Integer>();

    public void primFactor1(int prim) {
        Boolean test = false;
        for (int i = 0; i < primFactor3(prim).size(); i++) {

            if (prim == primFactor3(prim).get(i)) {
                test = true;

            } else {
                test = false;

            }
        }
        if (test == true) {
            arr4.add(prim);

            System.out.println(arr4);
            for (int i = 0; i < arr4.size() - 1; i++) {
                System.out.print(arr4.get(i) + " * ");

            }
            System.out.println(arr4.get(arr4.size() - 1));

        } else {
            primFactor2(prim);
        }
    }

    public void primFactor2(int prim) {

        double prim2 = (double) prim;

        for (int i = 1; i < primFactor3(prim).size(); i++) {

            if (prim2 > 3 && prim2 % 2 == 0) {
                arr4.add(2);
                prim2 = prim2 / 2;
                primFactor1((int) prim2);
                break;

            }
            if (prim2 > 3 && prim2 % primFactor3(prim).get(i) == 0) {
                arr4.add(primFactor3(prim).get(i));
                prim2 = prim2 / primFactor3(prim).get(i);
                primFactor1((int) prim2);
                break;
            }
        }

    }

    public ArrayList<Integer> primFactor3(int prim) {
        ArrayList<Integer> arr6 = new ArrayList<Integer>();
        for (int i = 2; i <= prim; i++) {

            if (i % 2 == 0 && i > 2 || i > 3 && i % 3 == 0 || i > 5
                    && i % 5 == 0 || i > 7 && i % 7 == 0) {

            } else {
                arr6.add(i);
            }

        }

        for (int i = 0; i < arr6.size(); i++) {
            for (int j = 0; j < arr6.size(); j++) {
                if (arr6.get(i) % arr6.get(j) == 0
                        && arr6.get(i) != arr6.get(j)) {
                    arr6.remove(i);
                    i = i - 1;

                }

            }

        }

        return arr6;
    }

    // 18.3

    public void allPrim(int prim) {
        ArrayList<Integer> arr6 = new ArrayList<Integer>();
        for (int i = 2; i <= prim; i++) {

            if (i % 2 == 0 && i > 2 || i > 3 && i % 3 == 0 || i > 5
                    && i % 5 == 0 || i > 7 && i % 7 == 0) {

            } else {
                arr6.add(i);
            }

        }

        for (int i = 0; i < arr6.size(); i++) {
            for (int j = 0; j < arr6.size(); j++) {
                if (arr6.get(i) % arr6.get(j) == 0
                        && arr6.get(i) != arr6.get(j)) {
                    arr6.remove(i);
                    i = i - 1;

                }

            }

        }
        System.out.println(arr6);
    }

    // 19.1 - 19.5
    public void sum(int sum) {
        int newsum = sum;
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        if (sum % 2 != 0) {
            for (int i = 0; i <= sum; i++) {
                count = count + i;

            }
            System.out.println(count);

            while (sum > 0) {
                count1 = count1 + sum;
                sum--;
            }
            System.out.println(count1);

            do {
                count2 = count2 + newsum;

                newsum--;

            } while (newsum > 0);
            System.out.println(count2);
        } else {
            System.out.println("bitte eine ungerade Zahl eingeben");
        }

    }

    public void sumquadrat(int sum) {
        int count = 0;
        for (int i = 0; i <= sum; i++) {
            count = (int) (count + Math.pow(i, 2));

        }
        System.out.println(count);
    }

    // 20.1

    public double pi(int n) {

        double pi1 = 1;
        for (double i = 3; i <= n; i = i + 2) {
            if (i <= n - 2) {
                pi1 = pi1 - (1 / i);
                pi1 = pi1 + (1 / (i + 2));
                i = i + 2;

            }
        }
        pi1 = pi1 * 4;
        System.out.println(pi1);

        return pi1;
    }

    // 20.2
    public void piPercent(int n) {
        double mypi = pi(n);

        double differenz = ((mypi * 100 / Math.PI) - 100);
        DecimalFormat diff = new DecimalFormat("00.00");
        System.out.println("Unterschied betr�gt: " + diff.format(differenz)
                + "%");
        // Je mehr Reihenglieder vorhanden sind, umso exakter n�hert sich der
        // Wert an die Math.PI an
    }

    // read life curse for Dollar -> EURO
    public String getCurs() throws Exception {

        URL kurs = new URL(
                "http://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");

        BufferedReader in = new BufferedReader(new InputStreamReader(
                kurs.openStream()));

        String inputLine;
        String curs = null;
        try {
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.indexOf("US") != -1) {
                    curs = inputLine.substring(inputLine.lastIndexOf("='") + 2,
                            inputLine.lastIndexOf("'"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        in.close();

        return curs;
    }

    public static void main(String[] args){

        exercise3 a = new exercise3();
        //
        // a.intTodouble(-2, 42);

        // a.doubleToint(2.5, 4.1);

        // a.sortOfthree(1, 2, 3);
        // a.sortOfthree(1, 3, 2);
        // a.sortOfthree(2, 1, 3);
        // a.sortOfthree(2, 3, 1);
        // a.sortOfthree(3, 1, 2);
        // a.sortOfthree(3, 2, 1);

        // a.AndNot(42, 3);
        // a.AndNot(3, 42);
        // a.AndNot(11, 3);
        //
        // a.ticketPrice(20);
        // a.ticketPrice(15);
        //
        // a.sortDesicion(1, 2, 3);
        // a.sortDesicion(3, 2, 1);
        //
        // a.loop();
        //
        // a.wochentage();
        // a.wochentage2();
        //
        // a.BMI();
        // a.currency();
        // a.dhl();
        //
        // a.dez(333);
        // a.gleitkomma(3.355556);
        // a.intToRom(10699);
        // a.romToInt("M      C D          L XL | X");
        // a.isPrim(61);
         a.primFactor1(103);
        // a.allPrim(400);
        // a.sum(11);
        // a.sumquadrat(3);
        // a.pi(1000);
        // a.piPercent(10000);

}
}

