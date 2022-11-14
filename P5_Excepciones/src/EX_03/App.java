package EX_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] myArray = new int[10];//Array de 10 posiciones
        try {
            Scanner entrada = new Scanner(System.in);
            int numero;
            for (int i = 0; i < 11; i++) {//Recorro 11 posiciones para comprobar que se encuentra fuera del límite AOI
                System.out.println("Número posición ==> " + i);
                numero = entrada.nextInt();
                myArray[i] = numero;
            }
        } catch (InputMismatchException ime) { //Si el valor introducido es una letra u otro caracter muestra el mensaje.
            System.out.println("Algún valor introducido no es un número.");
        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("Se ha sobrepasado el límite del array!");
        }
    }

}
