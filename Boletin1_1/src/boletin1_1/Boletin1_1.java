package boletin1_1;

import java.util.*;

public class Boletin1_1 {

//Clase con un metodo que calcula a area de un triangulo dadas a base e a altura
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;
        boolean validar;

        System.out.println("****************************************************\n"
                + "|           Calcular area de un triangulo           |\n"
                + "****************************************************");

        do {
            System.out.println("Introduce a base: ");
            base = teclado.nextInt();
            if (base <= 0) {
                System.out.println("La base no puede ser menor o igual a 0");
                validar = false;
            } else {
                validar = true;
            }

        } while (validar == false);

        do {
            System.out.println("Introduce a altura: ");
            altura = teclado.nextInt();
            if (altura <= 0) {
                System.out.println("La altura no puede ser menor o igual a 0");
                validar = false;
            } else {
                validar = true;
            }

        } while (validar == false);

        int area = base * altura / 2;
        System.out.println("A area do triangulo e: " + area);

    }
}
