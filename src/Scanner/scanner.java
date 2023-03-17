package Scanner;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class scanner {
    public static void main(String[] args) {




           boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("mete dos numeros: ");
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("numeros invalidos");

                }
            }while (!ok);

            try {
                PrintStream info = new PrintStream("copia.txt");
                info.println("hola");
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

    }
}