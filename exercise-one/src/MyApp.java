import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        //defino variables
        int firstNumber;
        int secondNumber;
        int result;

        //habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //leo datos de usuario
        System.out.println("ingrese el primer numero para el calculo: ");
        firstNumber = keyboard.nextInt();
        System.out.println("ingrese el segundo numero para el calculo: ");
        secondNumber = keyboard.nextInt();

        //realizo el proceso y lo guardo en la variable result
        result = firstNumber + secondNumber;

        //muestro resultado
        System.out.println("el resultado es: " + result);





    }


}
