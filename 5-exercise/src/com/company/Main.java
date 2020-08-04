package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner (System.in);

        double priceByM2;
        int area;
        double totalPrice;

        System.out.println ("Ingrese el precio que se cobra por m2 ");
        priceByM2 = keyboard.nextDouble();

        System.out.println("Ingrese el area a pintar ");
        area = keyboard.nextInt();

        totalPrice = priceByM2*area;

        System.out.println("El precio total del trabajo es $" + totalPrice);
    }
}
