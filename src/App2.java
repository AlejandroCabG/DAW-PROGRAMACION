import java.util.Scanner;

public class App2 {
   /* En España cada persona tiene un documento nacional de identidad (DNI) en el que
    figura un número y una letra. La letra que sigue al número es calculada en base a ese
    número de la siguiente manera:
    Se debe de tomar el resto de dividir nuestro número de DNI entre 23, en consecuencia,
    el resultado se encontrará entre 0 y 23.
    Crea un método que, según el resultado de la fórmula anterior, busque en un array de
    caracteres su correspondiente letra. El array es el siguiente*/

    // dni= 41005975B;
    // dni%23

    public static void main(String[] args) {
        int dni;//variable DNI
        //creo un array de letras
    String letras [] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el DNI: ");
        dni = entrada.nextInt();//introduzco por teclado los números del DNI
        int posicion = dni%23;//hago el módulo del DNI y las 23 letras para obtener la posición de la letra.
        System.out.println("La letra es: "+letras[posicion]);//Muestro la posición de la letra correspondiente en el array.
        System.out.println("DNI: "+dni+"-"+letras[posicion]);
    }

}
