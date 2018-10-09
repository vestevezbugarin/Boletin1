package boletin1_5;

import java.util.*;

public class Boletin1_5 {
//Clase con un metodo que calcula cantos metros ten una distancia en millas mariñas

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float millas, metros;
        boolean validar;
        int cambio = 1852;

        System.out.println("****************************************************\n"
                + "*   Valor de 1 milla expresada en metros = 1852m   *\n"
                + "****************************************************");
        do {
            System.out.println("Introduce a distancia en millas que desexa converter: ");
            millas = teclado.nextFloat();
            if (millas <= 0) {
                validar = true;
            } else {
                System.out.println("As distancias negativas non se poden calcular");
                validar = false;
            }
        } while (validar == false);

        metros = millas * cambio;
        System.out.println("\nResultado: " + millas + " millas son " + metros + " metros.");
    }
}
