package EX_05;
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