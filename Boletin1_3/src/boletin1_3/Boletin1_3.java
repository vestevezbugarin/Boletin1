package boletin1_3;

import java.util.*;

public class Boletin1_3 {
//Clase con un metodo que calcula o cambio de duas divisas,solicitando datos por teclados

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float cambio = 0, euros = 0, dolares;
        boolean validar = false;
        System.out.println("****************************************************\n"
                + "|             Calculo de divisas: € - $            |\n"
                + "****************************************************");
        do {
            System.out.println("Introduce o valor actual en dolares de 1 euro: ");
            cambio = teclado.nextFloat();
            if (cambio <= 0) {
                System.out.println("O cambio non puede ser menor ou igual a 0\n");
            } else {
                validar = true;
            }
        } while (validar == false);
        do {
            System.out.println("Introduce a cantidade de euros a converter: ");
            euros = teclado.nextFloat();
            if (cambio <= 0) {
                System.out.println("A cantidade non puede ser menor que  0\n");
                validar = false;
            } else {
                validar = true;
            }
        } while (validar == false);
        dolares = euros * cambio;
        System.out.println("\n" + euros + " euros son actualmente " + dolares + " dolares.");
    }
}
