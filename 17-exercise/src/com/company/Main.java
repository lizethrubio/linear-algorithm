package com.company;

//17. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para
//        determinar el promedio que obtendrá un alumno considerando que realiza tres
//        exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%,
//        mientras que el tercero de 50%.

import sun.nio.ch.SimpleAsynchronousFileChannelImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        double  finalNote;
        double  examOne;
        double  examTwo;
        double  examThree;

        System.out.printf("Ingrese la nota del primer examen ");
        examOne = keyboard.nextDouble();

        System.out.printf("Ingrese la nota del segundo examen ");
        examTwo = keyboard.nextDouble();

        System.out.printf("Ingrese la nota del tercer examen ");
        examThree = keyboard.nextDouble();

        finalNote = examOne*0.25 + examTwo*0.25 + examThree*0.5;

        System.out.printf("Su nota final es de " + finalNote);

    }
}
