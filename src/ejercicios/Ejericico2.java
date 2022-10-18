// TESTS
// = Habrá que comprobar con un DNI bien introducido y uno mal introducido
// = Combrobar con cada uno de los casos es una perdida de tiempo ya que no puedes saber el módulo de cada uno

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejericico2 {
    public static void main(String[] args) {
        // ? Programa para calcular la letra del DNI en base al numero del DNI, cada letra corresponde a un numero
        // ^ Creamos las variables que vamos a utilizar, DNI y letraDNI
        int dni, numeroLetra;
        char letraDni;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el DNI sin la letra
        System.out.print("Introduce el DNI sin la letra: ");
        dni = read.nextInt();

        // ! Calculamos la letra del DNI, esto se consigue haciendo el módulo de 23 del DNI
        numeroLetra = dni % 23;

        // ! Dependiendo del numero de la letra, se le asigna una letra. Esto lo haremos mediante un switch case
        switch (numeroLetra) {
            case 0:
                letraDni = 'T';
                break;
            case 1:
                letraDni = 'R';
                break;
            case 2:
                letraDni = 'W';
                break;
            case 3:
                letraDni = 'A';
                break;
            case 4:
                letraDni = 'G';
                break;
            case 5:
                letraDni = 'M';
                break;
            case 6:
                letraDni = 'Y';
                break;
            case 7:
                letraDni = 'F';
                break;
            case 8:
                letraDni = 'P';
                break;
            case 9:
                letraDni = 'D';
                break;
            case 10:
                letraDni = 'X';
                break;
            case 11:
                letraDni = 'B';
                break;
            case 12:
                letraDni = 'N';
                break;
            case 13:
                letraDni = 'J';
                break;
            case 14:
                letraDni = 'Z';
                break;
            case 15:
                letraDni = 'S';
                break;
            case 16:
                letraDni = 'Q';
                break;
            case 17:
                letraDni = 'V';
                break;
            case 18:
                letraDni = 'H';
                break;
            case 19:
                letraDni = 'L';
                break;
            case 20:
                letraDni = 'C';
                break;
            case 21:
                letraDni = 'K';
                break;
            case 22:
                letraDni = 'E';
                break;
            default:
                System.out.println("El DNI debe estar entre 00000000 y 99999999");
                letraDni = ' ';
                break;
        }

        // ! Mostramos el DNI con la letra
        System.out.println("El DNI con la letra es: " + dni + letraDni);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}