package EX_04;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entra un número entero : ");


        boolean valor = true; // Condición booleana
        do {
            try {
                int num = entrada.nextInt(); //Casta a int del valor por teclado
                int cuadrado = num * num; //Operación para conseguir el cuadrado de un número.
                System.out.println("El resultado es ==> " + cuadrado);
                valor = true;

            } catch (InputMismatchException ime) { //Compruebo que el valor introducido sea un número y sino que muestre el mensaje, para informar que se introduzca uno.
                System.out.println("Has introducido una letra o un símbolo. Pon un número entero!!!");
                entrada.nextLine();
               valor = false;

            } finally {
                System.out.println();
            }

        }
        while(valor==false);
    }

}
