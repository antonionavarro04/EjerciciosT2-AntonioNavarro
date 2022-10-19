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

        // ^ Crearemos una variable String para que se determine si el descuento fue aplicado o no.
        String descuento = "No";

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);
        
        // ! Pedimos al usuario que introduzca la distancia que recorrerá su tren
        System.out.print("Introduce la distancia que recorrerá tu tren: ");
        distancia = read.nextDouble();
        
        // ? Salto de linea
        System.out.println();
        
        // ! Pedimos al usuario que introduzca los días de estancia
        System.out.print("Introduce los días de estancia: ");
        estancia = read.nextByte();
        
        // ? Salto de linea bonito
        System.out.println();System.out.println("--------------------");System.out.println();

        // ! Comprobamos que los datos son validos, en caso de no serlo acabaremos el programa
        if (distancia < 0 || estancia < 0) {
            System.out.println("La distancia introducida no es valida");
        } else {
            // ! Calculamos el precio final
            precioFinal = distancia * PRECIO_KM;

            // ! Comprobamos mediante un if si el descuento va a ser aplicado o no
            if (estancia > 7 && distancia > 700){
                precioFinal = precioFinal * 0.7;
                descuento = "Si";
            }

            // ! Mostramos el precio final
            System.out.println("El precio final es de: " + precioFinal + "€");
            System.out.println(descuento + " se ha aplicado el descuento");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
