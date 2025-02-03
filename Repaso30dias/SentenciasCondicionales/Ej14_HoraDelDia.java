package SentenciasCondicionales;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
* ***Ej14. Realiza un programa que pida una hora por teclado y muestre buenos días, tardes o noches según la hora. Tramos de 6-12, 13-20 y 21-5****/
public class Ej14_HoraDelDia {
    public static void main(String[] args) {

        String saludo;
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println(hora.format(formatoHora));
        int horaConv = (int) hora.getHour();
        System.out.println(horaConv);
        if (horaConv > 6 && horaConv < 12) {
            saludo = "Buenos días ";
        } else if (horaConv > 13 && horaConv < 20) {
            saludo = "Buenas tardes ";
        } else if (horaConv > 21 && horaConv < 5) {
            saludo = "Buenas noches ";
        } else {
            saludo = "Buenas";
        }
        System.out.println(saludo + "la hora actual es: " + hora);
    }
}
