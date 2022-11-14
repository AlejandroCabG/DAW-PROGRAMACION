## Excepciones

### Alejandro Cabrera González

1. Define una clase “NegativeNumberException” que herede de “Exception” y que contenga un constructor sin parámetros y
un constructor que reciba como parámetro un String, de tal modo que ambos invoquen a los constructores de la clase “Exception” correspondientes.

        public class NegativeNumberException extends Exception{
       //Constructor
       public NegativeNumberException() {
       }
       //Constructor con un parámetro de tipo String
       public NegativeNumberException(String message) {
       super(message);
       }


2. ¿Qué tiene de especial la excepción del tipo “RuntimeException”?
Tiene de especial en que se comprueban en tiempo de ejecución. RuntimeException
es la superclase de todas aquellas excepciones que se pueden lanzar durante la ejecución normal del programa Java y se conocen como excepciones sin comprobación.

3. Escribe un código que genere y capture una excepción al sobrepasar el límite de un array. Añada el código a la tabla

       //Importo las dos clases   
       import java.util.InputMismatchException;
       import java.util.Scanner;

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

4. Crea un programa con un bucle while que pida al usuario un número entero y muestre el resultado del cuadrado. 

En caso de introducir un carácter o valor que no sea un número, captura la excepción y vuelva a pedirle el número hasta 
que sea correcto. Añada el código a la tabla.

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

5. Propón y soluciona un ejercicio que trabaje las excepciones.

       import java.io.FileNotFoundException;
       import java.io.PrintWriter; //Clase printWriter

       //Programa para crear un archivo txt con un try-catch para comprobar que se ha guardado con éxito.
       public class App {
       public static void main(String args[]) {
       PrintWriter pw;
       try {
       pw = new PrintWriter("Ejemplo.txt"); //Creo el archivo con extensión .txt
       pw.println("Documento guardado");
         }
       catch (FileNotFoundException fnfe) { //Indica que se ha producido un error al intentar abrir el archivo indicado por un nombre de ruta de acceso especificado.
          System.out.println(fnfe);
         }
           System.out.println("El archivo se ha guardado con éxito!");
         }
       }