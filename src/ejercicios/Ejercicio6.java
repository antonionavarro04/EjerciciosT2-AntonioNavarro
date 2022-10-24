// TESTS
// = Habrá que comprobar introduciendo el resultado bien y mal

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Juego de la suma, se generaran dos números aleatorios entre 0 y 99 y el usuario debera calcularlo y sacar su resultado. El programa indicará si esta en lo correcto o por lo contrario se ha equivocado
        // ^ Declaramos las variables num1, num2, resultado y resultadoUsuario
        int num1, num2, resultado, resultadoUsuario;
        
        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su localización a la US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Generamos los dos números aleatorios
        num1 = (int) (Math.random() * 99) + 1;
        num2 = (int) (Math.random() * 99) + 1;

        // ! Calculamos el resultado
        resultado = num1 + num2;

        // ! Presentamos el juego al usuario para acto seguido pedirle que introduzca el resultado
        System.out.println("Este es el juego de la suma, cuando pulses 'enter' comenzará el juego,");
        System.out.println("de forma que te daremos dos numeros a sumar y tendrás que indicar el resultado");
        System.out.println();
        System.out.println("Pulsa una 'enter' para comenzar");
        read.nextLine();

        // ? Triple salto de línea
        System.out.println();System.out.println("--------------------");System.out.println();

        // ! Mostramos los números y pedimos el resultado
        System.out.print(num1 + " + " + num2 + " = ");
        resultadoUsuario = read.nextInt();

        // ! Comprobamos si el resultado es correcto o no
        if (resultado == resultadoUsuario) {
            System.out.println("¡Enhorabuena! Has acertado");
        } else {
            System.out.println("Lo siento, has fallado, el resultado correcto es " + resultado);
        }

        // ^ Ceramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
