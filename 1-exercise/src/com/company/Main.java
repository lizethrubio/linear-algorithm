package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int base;
        int height;
        int area;

        //habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Ingrese la base del triangulo");
        base = keyboard.nextInt();

        System.out.println("ingrese la altura del triangulo");
        height= keyboard.nextInt();

        area = base * height /2;

        System.out.println("El area del triangulo es: " + area);


    }
}
