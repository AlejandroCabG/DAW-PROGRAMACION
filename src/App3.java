public class App3 {
    public static void main(String[] args) {
        int array[][] = new int[4][5];
        int i;//filas
        int j;//columnas
        for (i = 0; i < 4; i++) { //filas
            for(j = 0; j < 5; j++){//columnas
                array[i][j] = (int) (Math.random() * 9) +0;
            }
            int suma;
            for (i=0;i<4;i++){
                suma = 0;
                for (j=0;j<5;j++){
                    System.out.println(array[i][j]);
                    suma += array[i][j];
                }
                System.out.println("La suma es "+suma);
            }
        }


    }

}
