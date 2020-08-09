package com.company;
//
//11. La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
//        persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW). Realice
//        un diagrama de flujo y pseudocódigo que representen el algoritmo que permita
//        determinar ese pago.

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);

	    double energyBill;
	    double  KWConsume;
	    double  KWCost;

        System.out.println("Ingrese el costo por kilowatts ");
        KWCost = keyboard.nextDouble();

        System.out.println("Ingrese el consumo en kilowatts que tuvo la persona este mes");
        KWConsume = keyboard.nextDouble();

        energyBill = KWConsume * KWCost;
        System.out.println("El pago que debe realizar la persona por su consumo es $" +energyBill);



    }
}
