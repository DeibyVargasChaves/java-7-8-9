package imputStream;
import java.io.*;

public class main {
    public static void main(String[] args) {

        try {

            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                //byte datos[]= new byte[5];
                int dato;
                dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.print((char)dato);
                    dato = ficheroBuffer.read();
                }

            }catch (IOException e) {
                System.out.println("no puedo leer el fichero: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("oye, el programa da error: " + e.getMessage());

        }
    }
}
