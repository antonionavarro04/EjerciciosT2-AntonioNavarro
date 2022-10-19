// TESTS
// = Habrá que comprobar con un numero dentro del Rango
// = Habrá que comprobar con un numero fuera del rango
// = Habrá que comprobar con un número por cada uno de los rangos introducido en el if

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa el cual te diga el numero pero en letras
        // ^ Creamos las variables que vamos a utilizar, numero, uds y dec
        int numero, uds, dec;
        // ^ Crearemos tambien los Strings para las Letras
        String udsLetra, decLetra;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);
        
        // ! Pedimos al usuario que introduzca un numero comprendido entre el 0 y el 99
        System.out.print("Introduce un número del 0 al 99: ");
        numero = read.nextInt();

        // ! Comprobamos que el numero introducido por el usuario esta dentro del rango de 0 a 99, si no lo esta acabaremos el programa
        if (numero < 0 || numero > 99) {
            System.out.println("El numero introducido no esta dentro del rango de 0 a 99");
            System.exit(1);
        }
        
        // ! Separamos el número en unidades y decenas
        uds = numero % 10;
        dec = numero / 10;

        // ! Mediante el switch sacaremos los valores de las Uds
        switch (uds) {
            case 0:
                udsLetra = "cero";
                break;
            case 1:
                udsLetra = "uno";
                break;
            case 2:
                udsLetra = "dos";
                break;
            case 3:
                udsLetra = "tres";
                break;
            case 4:
                udsLetra = "cuatro";
                break;
            case 5:
                udsLetra = "cinco";
                break;
            case 6:
                udsLetra = "seis";
                break;
            case 7:
                udsLetra = "siete";
                break;
            case 8:
                udsLetra = "ocho";
                break;
            case 9:
                udsLetra = "nueve";
                break;
            default:
                udsLetra = "Error";
                break;
        }

        // ! Mediante el switch sacaremos los valores de las Dec
        switch (dec){
            case 2:
                decLetra = "veinte";
                break;
            case 3:
                decLetra = "treinta";
                break;
            case 4:
                decLetra = "cuarenta";
                break;
            case 5:
                decLetra = "cincuenta";
                break;
            case 6:
                decLetra = "sesenta";
                break;
            case 7:
                decLetra = "setenta";
                break;
            case 8:
                decLetra = "ochenta";
                break;
            case 9:
                decLetra = "noventa";
                break;
            default:
                decLetra = "Error";
                break;
        }

        // ! Mediante un if vamos a separar los casos
        if (numero >= 0 && numero <= 9){
            System.out.println("El numero " + numero + " en letras es " + udsLetra);
        } else if (numero >= 10 && numero <= 15){
            // ! Switch para los casos especiales de los 10 al 15
            switch (uds){
                case 0:
                    udsLetra = "diez";
                    break;
                case 1:
                    udsLetra = "once";
                    break;
                case 2:
                    udsLetra = "doce";
                    break;
                case 3:
                    udsLetra = "trece";
                    break;
                case 4:
                    udsLetra = "catorce";
                    break;
                case 5:
                    udsLetra = "quince";
                    break;
            }
            System.out.println("El numero " + numero + " en letras es " + udsLetra);
        } else if (numero >= 16 && numero <= 19){
            decLetra = "dieci";
            System.out.println("El numero " + numero + " en letras es " + decLetra + udsLetra);
        } else if (dec != 0 && uds == 0){
            System.out.println("El numero " + numero + " en letras es " + decLetra);
        } else if (numero >= 21 && numero <= 29){
            decLetra = "veinti";
            System.out.println("El numero " + numero + " en letras es " + decLetra + udsLetra);
        } else if (numero >= 31 && numero <= 99){
            System.out.println("El numero " + numero + " en letras es " + decLetra + " y " + udsLetra);   
        } else if (decLetra == "Error" || udsLetra == "Error"){
            System.out.println("Error, alguno de los numeros no se a introducido correctamente");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
