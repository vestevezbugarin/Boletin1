package boletin1_2;

import java.util.*;

public class Boletin1_2 {
//Clase con un metodo que calcula a area de un cadrado dado o lado

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int lado, area;
        boolean validar;
        System.out.println("****************************************************\n"
                + "|           Calcular area de un cadrado            |\n"
                + "****************************************************");
        do {
            System.out.println("Introduce el lado: ");
            lado = teclado.nextInt();
            if (lado <= 0) {
                System.out.println("El lado no puede ser menor o igual a 0\n");
                validar = false;
            } else {
                validar = true;
            }
        } while (validar == false);
        area = lado * lado;
        System.out.println("A area do cadrado e: " + area);
    }
}
