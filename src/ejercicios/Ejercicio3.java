// TESTS
// = Habrá que comprobar con la comida suficiente para todos los animales
// = Habrá que comprobar habiendo menos comida de la cuenta
// = Habrá que comprobar sin que haya animales

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa para una granja en la cual se compra diariamente una cantidad de comida determinada para los animales, los animales comen la misma cantidad de comida diariamente.
        // ? El programa debe pedirle al usuario la cantidad de comida comprada, numero de animales y la cantidad de comida que comen los animales.
        // ^ Creamos las variables que vamos a utilizar, comida, animales y kilosComida
        double comida, kilosComida, kilosTotal;
        long animales;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos la cantidad de comida comprada, numero de animales y la cantidad de comida que comen los animales
        System.out.print("Introduce la cantidad de comida comprada: ");
        comida = read.nextDouble();
        System.out.print("Introduce el numero de animales: ");
        animales = read.nextLong();
        System.out.print("Introduce la cantidad de comida que comen los animales (KG): ");
        kilosComida = read.nextDouble();

        // ! Primeramente comprobaremos que los animales no sean 0, ya que si lo son, no se puede dividir entre 0
        if (animales == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            // ! Si los animales no son 0, calcularemos la cantidad de comida que le toca a cada animal
            if (animales <= 0) {
                System.out.println("Tienes que tener mínimo 1 animal");
            } else { // ? La comida total es la comida que comen por el numero de animales
                kilosTotal = kilosComida * animales;

                // ! Comprobamos si la comida da o no para todos los animales
                if (kilosTotal <= comida) {
                    System.out.println("La comida da para todos los animales");
                } else {
                    System.out.println("La comida no da para todos los animales");

                    // ! Calculamos cuanto le corresponde a cada animal con la comida limitada
                    kilosTotal = comida / animales;
                    System.out.println("Cada animal comerá " + kilosTotal + " KG");
                }
            }
            
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
