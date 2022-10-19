// TESTS
// = Habrá que comprobar introduciendo una hora en la que los segundos y los minutos sean 59, para ver si incrementa correctamente la hora
// = Habrá que combrobar introduciendo 23:59:59 ya que así la hora cambiaría a 00:00:00

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa que dada una hora por teclado (hh:mm:ss), incremente los segundos en 1 y muestre la hora resultante
        // ^ Declaramos las variables hora, minutos y segundos
        byte hora, minutos, segundos;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos la hora al usuario
        System.out.print("Introduce la hora (hh): ");
        hora = read.nextByte();

        System.out.print("Introduce los minutos (mm): ");
        minutos = read.nextByte();

        System.out.print("Introduce los segundos (ss): ");
        segundos = read.nextByte();

        // ! Incrementamos los segundos en 1
        segundos++;

        // ! Mediante una estructura if vamos a comprobar que el incremento de los segundos no haya hecho que haya que incrementar minutos y horas
        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }
        // ! Mostramos la hora resultante
        System.out.println("La hora resultante es " + hora + ":" + minutos + ":" + segundos);

        // ^ Ceramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro        
    }
}
