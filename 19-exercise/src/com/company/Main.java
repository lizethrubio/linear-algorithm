package com.company;

//19. El hotel “Cama Arena” requiere determinar lo que le debe cobrar a un huésped por su
//        estancia en una de sus habitaciones. Realice un diagrama de flujo y pseudocódigo que
//        representen el algoritmo para determinar ese cobro.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double days;
        double dailyPriceRoom;
        double  clientBill;

        System.out.println("Ingrese cuantos dìas se ha hospedado en el hotel ");
        days = keyboard.nextDouble();

        System.out.println("Ingrese cual es el precio diario de la habitación ");
        dailyPriceRoom = keyboard.nextDouble();

        clientBill  = days * dailyPriceRoom;

        System.out.printf("La cuenta total del cliente es de $ %.2f, por los  %.0f dìas de alojamiento en el hotel ", clientBill, days);



    }
}
