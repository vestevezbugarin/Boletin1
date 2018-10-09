package boletin1_4;

import java.util.*;

public class Boletin1_4 {
//Clase con un metodo que realiza diferentes calculos con dous valores

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        //Utilizanse floats debido ao caracter descoñecido dos valores introducidos
        float num1, num2, x;
        float cociente;
        boolean validar = true;
        
        System.out.println("Introduce el valor actual de \"num1\": ");
        num1 = teclado.nextFloat();
        System.out.println("Introduce el valor actual de \"num2\": ");
        
        num2 = teclado.nextFloat();
        
        float suma = num1 + num2;
        float resta = num1 - num2;
        float produto = num1 * num2;
        do {
            if (num2 == 0) {
                System.out.println("\nA division entre cero xeneraria infinito,\n"
                        + "polo que trocamos 0 por 1 automaticamente");
                x = 1;
            } else {
                x = num2;
                validar = true;
            }
            cociente = num1 / x;
        } while (validar == false);
        System.out.println("\nA suma de     " + num1 + " mais   " + num2 + " =  " + suma
                + "\nA resta de    " + num1 + " menos  " + num2 + " =  " + resta
                + "\nO cociente de " + num1 + " entre  " + x + " =  " + cociente
                + "\nO produto de  " + num1 + " por    " + num2 + " =  " + produto);
    }
}
