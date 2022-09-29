public class App3 {
    public static void main(String[] args) {
        int array[][] = new int[4][5];
        int i;//filas
        int j;//columnas
        for (i = 0; i < 4; i++) { //filas
            for (j = 0; j < 5; j++) {//columnas
                array[i][j] = (int) (Math.random() * 9) + 0;
            }
        }
        int sumaFila;//SUMA DE LA FILA
        for (i = 0; i < 4; i++) {
            sumaFila = 0;
            for (j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t|\t");
                sumaFila += array[i][j];
            }
            System.out.println(sumaFila + "\t|\t");//suma fila con dos tabulaciones y |
        }
        for (j = 0; j < 5; j++) {
            System.out.print("--------");
        }
        System.out.print("-----" + "\n");

        int sumaCol;
        int sumaTotal = 0;
        for (j = 0; j < 5; j++) {
            sumaCol = 0;
            for (i = 0; i < 4; i++) {
                sumaCol += array[i][j];//suma de las columnas
            }
            sumaTotal += sumaCol;
            System.out.print(sumaCol + "\t|\t");

        }
        System.out.print(sumaTotal + "\t|\t");
    }
}