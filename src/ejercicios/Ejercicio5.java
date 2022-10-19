// TESTS
// = Habrá que comprobar con un número positivo y otro negativo

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa que mediante un operador ternario muestre el valor absoluto de un numero
        // ^ Declaramos las variables num y numAbs
        double num, numAbs;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca un numero
        System.out.print("Introduce un numero, puede contener decimales: ");
        num = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("--------------------");System.out.println();

        // ! Quitamos o no el signo dependiendo de si es positivo o negativo
        numAbs = (num < 0) ? -num : num;

        // ! Mostramos el resultado
        System.out.println("El valor absoluto de " + num + " es " + numAbs);
        
        // ^ Ceramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
