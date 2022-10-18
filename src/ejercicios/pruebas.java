package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class pruebas {
    public static void main(String[] args) {
        // ^ Creamos las variables que vamos a utilizar
        int udsInv = 0, decInv = 0, cenInv = 0, milInv = 0;
        // ^ Scanner
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos numeros
        System.out.print("Introduce un número: ");
        int num1 = read.nextInt();

        // ! Hacemos el modulo de todo
        int uds = num1 % 10;
        int dec = num1 % 100;
        int cen = num1 % 1000;
        int mil = num1 % 10000;

        // ! Separar el numero de 4 cifras con cada cifra por un lado
        udsInv = uds / 1;
        decInv = dec / 10;
        cenInv = cen / 100;
        milInv = mil / 1000;

        // ! Invertir el numero
        int numInv = (udsInv * 1000) + (decInv * 100) + (cenInv * 10) + (milInv * 1);

        // ! Mostramos el numero invertido
        System.out.println(udsInv);
        System.out.println(decInv);
        System.out.println(cenInv);
        System.out.println(milInv);

        System.out.println(numInv);

        // ^ Cerramos el Scanner
        read.close();

    }
}
