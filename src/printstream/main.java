package printstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte[]datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        }catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());

        }
    }
}
