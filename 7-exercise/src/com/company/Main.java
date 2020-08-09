package com.company;


//7. La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
//        boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
//        kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
//        para tal fin.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double kmCost;
        double travelCost;
        int km;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("ingresa el costo por kilometro");
        kmCost = keyboard.nextDouble();

        System.out.println("Ingresa los kilometros a viajar");
        km = keyboard.nextInt();

        travelCost = kmCost*km;

        System.out.println("El costo del boleto de viaje es $" + kmCost);
    }
}
