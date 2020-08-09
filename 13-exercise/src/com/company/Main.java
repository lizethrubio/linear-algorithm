package com.company;

//13. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
//        determinar cuánto dinero ahorra una persona en un año si considera que cada semana
//        ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el
//        sueldo).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner (System.in);

        double annualSavings;
        double salaryByWeek;
        final   double  SAVING_PERCENT;

        SAVING_PERCENT = 0.15;

        System.out.println("Ingrese su salario semanal");
        salaryByWeek = keyboard.nextDouble();

        annualSavings = salaryByWeek*SAVING_PERCENT*4*12;

        System.out.println("El ahorro anual de la persona es $" + annualSavings);

    }
}
