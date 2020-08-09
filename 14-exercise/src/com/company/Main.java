package com.company;

//14. Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de
//        sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los
//        gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros
//        gastos. El monto debe estar desglosado para cada concepto. Realice un diagrama de
//        flujo y pseudocódigo que representen el algoritmo que determine el monto del cheque.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
        double checkAmount;
        int travelDays;
        double hotelExpenses;
        double  foodExpenses;
        final double DAILY_AMOUNT;
        DAILY_AMOUNT=100;

        System.out.println("Ingrese los dìas del viaje ");
        travelDays = keyboard.nextInt();

        System.out.println("Ingrese los gastos de hotel totales del viaje");
        hotelExpenses = keyboard.nextDouble();

        System.out.println("Ingrese los gastos por comida totales del viaje");
        foodExpenses = keyboard.nextDouble();

        checkAmount = travelDays*DAILY_AMOUNT + foodExpenses + hotelExpenses;

        System.out.printf("El cheque total de viaticos a pagar al trabajador es de $ %.2f, por concepto de comida es $ %.2f y por conpto de hotel es $ %.2f", checkAmount, foodExpenses, hotelExpenses);




    }
}
