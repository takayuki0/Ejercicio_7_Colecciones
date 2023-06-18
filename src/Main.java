import java.util.ArrayList;

/**
 * Crea un programa en Java para calcular el String de mayor longitud de todos los contenidos en un
 * ArrayList de String. El programa utilizará los siguientes métodos:
 * •Método leerArray(): este método recibe como parámetro el arrayList de Strings vacío.
 * El método pide por teclado cadenas de caracteres y las añade al ArrayList.
 * La lectura de cadenas termina cuando se introduce la palabra “FIN”.
 * •Método cadenaMasLarga(): este método recibe como parámetro el ArrayList de Strings con todas
 * las cadenas leídas anteriormente y devuelve el String de mayor longitud.
 */
public class Main {
    public static void main(String[] args) {

        CalcularLongitudString cadenas = new CalcularLongitudString();

        cadenas.leerArray();
        cadenas.cadenaMasLarga();








    }
}