import java.util.ArrayList;
import java.util.Scanner;

public class CalcularLongitudString {

    private ArrayList<String> misString;

    public CalcularLongitudString() {
        misString = new ArrayList<>();
    }

    public void leerArray() {
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        String cadena = "";
        while (seguir) {
            System.out.print("Ingrese Cadena ó Escriba 'FIN' para terminar: ");
            cadena = entrada.nextLine();
            if (cadena.equals("FIN")) {
                System.out.println("Has finalizado el ingreso de cadenas.");
                seguir = false;
            } else {
                misString.add(cadena);
            }
        }

    }

    public void cadenaMasLarga() {
        String cadenas[] = new String[misString.size()];
        misString.toArray(cadenas);
        int masLarga = 0;
        String cadenaMasLarga = "";
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > masLarga) {
                masLarga = cadenas[i].length();
                cadenaMasLarga = cadenas[i];
            }
        }
        System.out.println("La cadena de caracteres con mayor longitud es: " + cadenaMasLarga);
    }


}
