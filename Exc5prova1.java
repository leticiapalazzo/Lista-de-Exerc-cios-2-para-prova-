import java.util.Scanner;

// 5. Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre:
//  O número digitado ao quadrado;
//  A raiz quadrada do número digitado.

public class Exc5prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        if (numero > 0) {
            double quadrado = numero * numero;
            System.out.print("O quadrado de " + numero + " é igual a " + quadrado + ".");

            System.out.print(" ");

            double raiz = Math.sqrt(numero);
            System.out.print("A raiz de " + numero + " é igual a " + raiz + ".");
        } else {
            System.out.print("Tente novamente!");
        }

    } 

}
