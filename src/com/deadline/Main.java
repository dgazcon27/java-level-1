package com.deadline;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;
import com.deadline.Tools;

public class Main {
    public static void main(String[] args) {
        Lens lens = new Lens("Sony","20X",false);
        lens.printDetails();
    }

    public static void callToolsClass() {
        char[] letters = {'A', 'b','c','a','d','x','g'};
        Tools tools = new Tools();
        char letter = 'a';
        int counter = tools.countLetters(letters, 'a');
        System.out.println("El numero de letras "+letter+" que hay es: "+counter);
    }

    public static void printFruits() {
        String[] fruits = {"Mango", "Naranja", "Pera"};
        System.out.println("Using For");
        for (int i = fruits.length-1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }
        System.out.println("Using ForEach");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }

    public static void mortgageCalculatorV2() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        final byte MONTHS_YEARS = 12;
        final byte PERCENT = 100;
        final int LOWER_PRINCIPAL = 1000;
        final int UPPER_PRINCIPAL = 1_000_000;
        final int LOWER_INTEREST = 0;
        final int UPPER_INTEREST = 30;
        final int LOWER_PERIOD = 0;
        final int UPPER_PERIOD = 0;

        Scanner inputPrincipal = new Scanner(System.in);
        Scanner inputInterest = new Scanner(System.in);
        Scanner inputPeriod = new Scanner(System.in);
        float principal = -1;
        float interest = -1;
        float period = -1;
        boolean isFinish = false;

        while (!isFinish) {
            if(principal < 0) {
                System.out.print("Principal (1K - 1M): ");
                principal = inputPrincipal.nextFloat();
                if(principal < LOWER_PRINCIPAL || principal > UPPER_PRINCIPAL) {
                    System.out.println("Debe ingresar un valor entre 1.000$ y 1.000.000");
                    principal = -1;
                    continue;
                }
            }
            if(interest < 0) {
                System.out.print("Interes anual: ");
                interest = inputInterest.nextFloat();
                if(interest <= LOWER_INTEREST || interest > UPPER_INTEREST) {
                    System.out.println("Debe ser un valor entre 1 y 30");
                    interest = -1;
                    continue;
                }
            }
            if(period < 0) {
                System.out.print("Periodo de pago: ");
                period = inputPeriod.nextFloat();
                if (period <= LOWER_PERIOD || period > UPPER_PERIOD) {
                    System.out.println("Debe ser un valor entre 1 y 30");
                    period = -1;
                    continue;
                }
            }
            float annualInteres = interest/PERCENT/MONTHS_YEARS;
            float annualCuotes = period*MONTHS_YEARS;

            double upSide = annualInteres*Math.pow(1+annualInteres,annualCuotes);
            double downSide = Math.pow(1+annualInteres,annualCuotes)-1;

            double result = principal*(upSide/downSide);
            System.out.println("Amortizacion: "+currency.format(result));
            isFinish = true;

        }


    }

    public static void fizzBuzz() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        float number = input.nextFloat();
        if(number % 2 == 0) {
            System.out.println(number);
        }
        if(number % 5 == 0) {
            if(number % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            System.out.println("Buzz");
        } else {
            System.out.println("Fizz");
        }
    }

    public static void mortgageCalculator () {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        final byte MONTHS_YEARS = 12;
        final byte PERCENT = 100;

        Scanner principalIn = new Scanner(System.in);
        System.out.print("Ingresa monto total: ");
        float principal = principalIn.nextFloat();

        Scanner interesIn = new Scanner(System.in);
        System.out.print("Ingresa tasa de interes: ");
        float interes = interesIn.nextFloat();

        Scanner cuotesIn = new Scanner(System.in);
        System.out.print("Ingresa periodo (Años): ");
        float cuotes = cuotesIn.nextFloat();

        float annualInteres = interes/PERCENT/MONTHS_YEARS;
        float annualCuotes = cuotes*MONTHS_YEARS;
        double upSide = annualInteres*Math.pow(1+annualInteres,annualCuotes);
        double downSide = Math.pow(1+annualInteres,annualCuotes)-1;

        double result = principal*(upSide/downSide);
        System.out.println("Amortizacion: "+currency.format(result));
    }

    public static void learned() {
        // write your code here
        int age = 30;
        long viewCount = 3_123_456_789L;
        float price = 10.32F;
        char letter = 'a';
        boolean isElegible = false;
        Date date = new Date();
        String message = "Hello   world"+" Daniel, hello";
        // older sintax
        int[] numbers = new int[5];
        numbers[4] = 21;
        // new syntax
        int[] numbers2 = {1,2,3,4};
        final float PI = 3.14f;
        int result = 15;
        int sum = 20;
        float res = (float)10/(float)3;
        // implicit casting
        // byte > short > int > long> float > double
        short x = 1;
        int y = x+2;

        String xx = "1";
        int yy = Integer.parseInt(xx)+3;
        System.out.println(yy);
        int resu = (int)(Math.random()*100);
        System.out.println(resu);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String bolivar = currency.format(123455.213);
        System.out.println(bolivar);
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        byte age2 = input.nextByte();
        System.out.println("Your age is: "+age2);
    }
}
