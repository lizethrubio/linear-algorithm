import java.sql.SQLOutput;
import java.util.Scanner;

public class MyApp {

//7. La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
//    boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
//    kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
//    para tal fin.


    public static void main(String[] args) {

        double travelCost;
        double  kmCost;
        int km;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el costo por kilometro");
        kmCost = keyboard.nextDouble();

        System.out.println("Ingrese los kilometros a recorrer");
        km = keyboard.nextInt();


        travelCost = km * kmCost;

        System.out.println("El costo del viaje es igual a " + travelCost);


    }
}
