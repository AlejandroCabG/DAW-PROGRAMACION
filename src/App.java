import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer array[] = new Integer[10];//creamos un array de 10 números
        int major = 0;
        int menor = 0;
        int igual = 0;
        Scanner entrada = new Scanner(System.in);//entrada de teclado

        for (int i = 0; i < 10; i++) {//bucle para ir recorriendo el a
            System.out.println("Introdueix un número: ");
            array[i] = entrada.nextInt();//introducir un número y guardarlo en el array

            if (array[i] < 0) {//comprobar que el valor del array
                System.out.println("El número és menor a 0");
                menor++;//incremente el número
            } else if (array[i] == 0) {
                System.out.println("El número és iguale a 0");
                igual++;//incremente el número
            }else{
                System.out.println("El número és major a 0");
                major++;//incremente el número
            }
        }
        //Visualiza los números
        System.out.println("Números mayors a "+menor);
        System.out.println("Números menors a "+igual);
        System.out.println("Números iguals a "+major);
    }
}
