package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pen pen1 = new Pen("Faber Castell Fineliner", 3.20f);
        Beer beer1 = new Beer("Puntigamer Panther", 1.50f);
        SelectProduct selectProduct = SelectProduct.PEN;
        SelectCurrency selectCurrency = SelectCurrency.EURO;
        int currency;
        int product;
        char currencySymbol = '€';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our shop! We accept Euro, Dollar, and Yen. Please select your currency: 1. Euro, 2. Dollar, 3. Yen");
        currency = sc.nextInt();

        if(currency == 1) {
            selectCurrency = SelectCurrency.EURO;
        } else if(currency == 2) {
            selectCurrency = SelectCurrency.DOLLAR;
        } else if(currency == 3) {
            selectCurrency = SelectCurrency.YEN;
        } else {
            System.out.println("ERROR");
        }

        switch(selectCurrency) {
            case EURO: System.out.println("You have opted to pay in Euro"); currencySymbol = '€'; break;
            case DOLLAR: System.out.println("You have opted to pay in Dollar"); currencySymbol = '$'; pen1.setPrice(3.50f); beer1.setPrice(1.70f); break;
            case YEN: System.out.println("You have opted to pay in Yen"); currencySymbol = '¥'; pen1.setPrice(400.00f); beer1.setPrice(190.00f); break;
            default: System.out.println("ERROR");
        }

        System.out.println("Please select the product you want to buy: 1. " + pen1.getProductName() + " for " + pen1.getPrice() + currencySymbol + ", 2. " + beer1.getProductName() + " for " + beer1.getPrice() + currencySymbol);
        product = sc.nextInt();

        if(product == 1) {
            selectProduct = SelectProduct.PEN;
        } else if(product == 2) {
            selectProduct = SelectProduct.BEER;
        } else {
            System.out.println("ERROR");
        }

        switch(selectProduct) {
            case PEN: pen1.buyProduct(); System.out.println(currencySymbol); break;
            case BEER: beer1.buyProduct(); System.out.println(currencySymbol); break;
            default: System.out.println("ERROR");
        }

    }
}
