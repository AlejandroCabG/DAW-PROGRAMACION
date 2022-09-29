public class App3 {
    public static void main(String[] args) {
        int array[][] = new int[4][5];
        int i;//filas
        int j;//columnas
        for (i = 0; i < 4; i++) { //filas
            for(j = 0; j < 5; j++){//columnas
                array[i][j] = (int) (Math.random() * 9) +0;
            }
            int suma;//SUMA DE LA FILA
            for (i=0;i<4;i++){
                suma = 0;
                for (j=0;j<5;j++){
                    System.out.print(array[i][j] + "\t|\t");
                    suma += array[i][j];
                }
                System.out.println(suma);//suma fila
            }
            for (j=0;j<5;j++){
                System.out.print("--------");
            }
            System.out.print("--------");
        }

        int sumaCol;
       int sumaTotal=0;
        for (j=0;j<5;j++)
            sumaCol=0;
        for (i = 0; i < 4; i++){
            sumaCol=array[i][j];
        }
       // sumaTotal+=sumaCol;
       // System.out.print(sumaCol);


    }
 //System.out.printf("|",sumaTotal);
}
//}