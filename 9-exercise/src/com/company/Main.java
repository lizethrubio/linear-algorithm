package com.company;

//9. Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en
//        el tiempo que dura la llamada y en el costo por minuto. Realice un diagrama de flujo y
//        pseudocódigo que representen el algoritmo para tal fin.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    double callCost;
    double minCost;
    double  minutesCall;


    Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el costo por minuto de llamada ");
        minCost = keyboard.nextDouble();

        System.out.println("Ingrese tiempo de duraciòn de llamada en minutos" );
        minutesCall = keyboard.nextDouble();

        callCost=minCost*minutesCall;

        System.out.println("El costo de la llamada telefonica es $" + callCost);

    }
}
