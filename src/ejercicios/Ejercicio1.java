// TESTS
// = Habrá qeu comprobar minimo con un numero capicua y otro no capicúa por cada intervalo de numeros
// = Habrá que comprobar que el numero que no esta dentro del rango se imprima correctamente

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java el cual pida al Usuario que introduzca un numero, el programa le dira si el numero es capicúa o no.
        // ? Ejemplo: 12321 es capicúa, 12345 no es capicúa.
        // ^ Creamos las variables que vamos a utilizar, numero y numeroInvertido para comprobar
        int numero, numeroInvertido = 0;
        // ^ Cada posición por separado para poder separar el numero
        int uds, dec, cen, mil;
        // ^ Cada posicion pero invertida, las unidades van a ser las mismas ya que dividir por 1 es lo mismo que no dividir
        int decInv, cenInv, milInv;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca un numero comprendido entre el 0 y el 9999
        System.out.print("Introduce un número del 0 al 99999: ");
        numero = read.nextInt();

        // ? Procedimiento para invertir el numero
        // ? Calculamos cada numero por el modulo segun las cifras que tenga el numero
        // ? Dividimos el numero por las cifras que tenga para obtener solo la parte que nos interesa
        // ? Multiplicamos cada numero por el numero contrario a la posicion que tiene

        // ! Comprobamos que el numero introducido por el usuario es capicúa
        if (numero >= 0 && numero <= 9) { // * Numero de una sola cifra
            numeroInvertido = numero;
        } else if (numero > 9 && numero < 100){ // * Numero de dos cifras
            uds = numero % 10;
            dec = numero % 100;

            decInv = dec / 10;

            numeroInvertido = (uds * 10) + (decInv);
        } else if (numero > 99 && numero < 1000){
            uds = numero % 10;
            dec = numero % 100;
            cen = numero % 1000;

            decInv = dec / 10;
            cenInv = cen / 100;

            numeroInvertido = (uds * 100) + (decInv * 10) + (cenInv);
        } else if (numero > 999 && numero < 10000){
            uds = numero % 10;
            dec = numero % 100;
            cen = numero % 1000;
            mil = numero % 10000;

            decInv = dec / 10;
            cenInv = cen / 100;
            milInv = mil / 1000;

            numeroInvertido = (uds * 1000) + (decInv * 100) + (cenInv * 10) + (milInv);
        }

        // ! Comprobamos si el numero introducido por el usuario es capicúa
        
        if (numero < 0 || numero > 99999) {
            System.out.println("El numero introducido no es valido");
            
        } else {
            if (numero == numeroInvertido) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}