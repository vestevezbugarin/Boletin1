package boletin1_6;

import java.util.*;

public class Boletin1_6 {
//Clase con un metodo que calcula a area de un rectangulo

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float base, altura;
        boolean validar;
        System.out.println("****************************************************\n"
                + "|           Calcular area de un rectangulo           |\n"
                + "****************************************************");

        do {
            System.out.println("Introduce a base: ");
            base = teclado.nextInt();
            if (base <= 0) {
                System.out.println("A base non pode ser menor ou igual a 0");
                validar = false;
            } else {
                validar = true;
            }
        } while (validar == false);
        do {
            System.out.println("Introduce a altura: ");
            altura = teclado.nextInt();
            if (altura <= 0) {
                System.out.println("A altura non pode ser menor ou igual a 0");
                validar = false;
            } else {
                validar = true;
            }
        } while (validar == false);
        System.out.println("\n*************************"
                + "\n|                       |"
                + "\n|                       | <--- Altura: " + altura + "m"
                + "\n|                       |"
                + "\n************************* <--- Base: " + base + "m");
        System.out.println("\nA area do rectangulo e: " + (base * altura) + " m.");
    }
}
