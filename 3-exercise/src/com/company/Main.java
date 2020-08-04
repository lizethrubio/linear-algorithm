package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name;
        int birthYear;
        int actualYear;
        int age;


        Scanner keyboard= new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        name = keyboard.next();

        System.out.println("Ingrese su año de nacimiento");
        birthYear = keyboard.nextInt();

        actualYear= Year.now().getValue();

        age= actualYear-birthYear;

        System.out.println("La edad del trabajador con nombre " + name + " es:  " + age);


    }
}
