// TESTS
// = Deberemos comprobar con los datos mal introducidos, ejemplo. -1, -2, etc
// = Deberemos comprobar con los datos dentro y fuera del descuento

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ? Programa que pide al usuario cuanto es la distancia que recorrerá su tren y los numeros de estancia, en caso de que este mas de 7 dias y recorra más de 800KM se le aplicará un descuento del 30%. El precio por kilometro es de 2.5€
        // ^ Creamos las variables que vamos a utilizar; distancia, estancia, precio, precioFinal
        final float PRECIO_KM = 2.5f;
        byte estancia;
        double distancia, precioFinal;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca la distancia que recorrerá su tren
        System.out.print("Introduce la distancia que recorrerá tu tren: ");
        distancia = read.nextDouble();

        // ! Pedimos al usuario que introduzca los días de estancia
        System.out.print("Introduce los días de estancia: ");
        estancia = read.nextByte();

        // ! Calculamos el precio final
        precioFinal = distancia * PRECIO_KM;

        // ! Comprobamos mediante un if si el descuento va a ser aplicado o no
        if (estancia > 7 && distancia > 700){
            precioFinal = precioFinal * 0.7;
        }

        // ! Mostramos el precio final
        System.out.println("El precio final es de: " + precioFinal + "€");

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
