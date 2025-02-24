package Funciones;

public class FuncionesVarias {

    public static int digitos(long x) {

        if (x < 0) {
            x = -x;
        }

        if (x == 0) {
            return 1;
        } else {

            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }


    }
}
