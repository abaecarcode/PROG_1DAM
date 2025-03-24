package EjerciciosFicheros;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        // System.out es un objeto PrintStream, que su a vez es de tipo OutputStream. PrintWriter tiene un constructor que toma un objeto OutputStream como argumento. Por tanto, si queremos convertir System.out en un objeto PrintWriter utilizaremos dicho constructor.
        PrintWriter pepe = new PrintWriter(System.out, true);
        pepe.print("He instanciado pepe para emplearlo como printeo en consola. ");
        System.out.println("Hello, World!");
        pepe.close();
    }
}