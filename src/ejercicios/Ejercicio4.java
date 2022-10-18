// TESTS
// = Habrá que comprobar con un numero dentro del Rango
// = Habrá que comprobar con un numero fuera del rango
// = Habrá que comprobar con un número de una y otro de dos cifras

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
        
        //  Pedimos al usuario que introduzca un numero comprendido entre el 0 y el 99
        System.out.print("Introduce un número del 0 al 99: ");
        numero = read.nextByte();

        // ! Comprobamos que el numero introducido por el usuario esta dentro del rango de 0 a 99, si no lo esta acabaremos el programa
        if (numero < 0 || numero > 99) {
            System.out.println("El numero introducido no esta dentro del rango de 0 a 99");
            System.exit(1);
        }
        
        // ! Separamos el número en unidades y decenas
        uds = numero / 10;
        dec = numero % 10;

        // ! Mediante el switch sacaremos los valores de las Uds y los casos especiales de 10, 11, 12, 13, 14, 15, 16, 17, 18 y 19
        switch (uds) {
            case 0:
                udsLetra = "Cero";
                break;
            case 1:
                udsLetra = "Uno";
                break;
            case 2:
                udsLetra = "Dos";
                break;
            case 3:
                udsLetra = "Tres";
                break;
            case 4:
                udsLetra = "Cuatro";
                break;
            case 5:
                udsLetra = "Cinco";
                break;
            case 6:
                udsLetra = "Seis";
                break;
            case 7:
                udsLetra = "Siete";
                break;
            case 8:
                udsLetra = "Ocho";
                break;
            case 9:
                udsLetra = "Nueve";
                break;
            case 10:
                udsLetra = "Diez";
                break;
            case 11:
                udsLetra = "Once";
                break;
            case 12:
                udsLetra = "Doce";
                break;
            case 13:   
                udsLetra = "Trece";
                break;
            case 14:
                udsLetra = "Catorce";
                break;
            case 15:
                udsLetra = "Quince";
                break;
            case 16:
                udsLetra = "Dieciseis";
                break;
            case 17:
                udsLetra = "Diecisiete";
                break;
            case 18:
                udsLetra = "Dieciocho";
                break;
            case 19:
                udsLetra = "Diecinueve";
                break;
            default:
                udsLetra = "Error";
                break;
        }

        // ! Mediante el if vamos a separar calculos
        if (numero >= 0 && numero <= 9){
            System.out.println("El numero " + numero + " en letras es " + udsLetra);
        } else if (numero > 9 && numero < 20){
            System.out.println("El numero " + numero + " en letras es " + udsLetra);
        } else if (numero > 19 && numero < 100){
            switch (dec) {
                case 2:
                    decLetra = "Veinte";
                    break;
                case 3:
                    decLetra = "Treinta";
                    break;
                case 4:
                    decLetra = "Cuarenta";
                    break;
                case 5:
                    decLetra = "Cincuenta";
                    break;
                case 6:
                    decLetra = "Sesenta";
                    break;
                case 7:
                    decLetra = "Setenta";
                    break;
                case 8:
                    decLetra = "Ochetenta";
                    break;
                case 9:
                    decLetra = "Noventa";
                    break;
                default:
                    decLetra = "Error";
                    break;
            }
            System.out.println("El numero " + numero + " en letras es " + udsLetra + " y " + decLetra);
        }
    }
}
