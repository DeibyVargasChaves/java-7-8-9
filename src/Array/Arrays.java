package Array;

public class Arrays {
// los arrays no pueden crecer ni encogerse pero pueden mutar de datos
    public static void main(String[] args) {
        /** int arrayUno[] = new int[5];
        arrayUno[0] =1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

                for (int i : arrayUno) {
                    System.out.println(i); }
         -------------------------------------------------**/


        /**
        String[] nombres = {"juan","pepe","Carlos"};

        System.out.println("longitud del array: " + nombres.length);

        for (String i : nombres){
                    System.out.println(i);
                }

        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre actual: " + nombres[i] + "en posicion: " + i);
               ultimoNombre = nombres[i];
        }
        System.out.println(ultimoNombre);
         -----------------------------------------**/
         int arrayBidi1[][] = {
           {1,2,3,4,5},
           {9,8,7,6,}
        };

        int[][] arrayBidi = new int[2] [4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i<arrayBidi.length; i++){
            System.out.println("valor de i: " + i);

            for (int j = 0; j < arrayBidi[0].length; j++){
                System.out.println("estas en fila = " + i + ", columna = " + j);
                System.out.println(arrayBidi[i][j]);
        }


    }
    }
}


