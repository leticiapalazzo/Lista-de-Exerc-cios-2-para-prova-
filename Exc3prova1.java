import java.util.Scanner;

// 3. Faça um programa que leia dois números e mostre o maior deles. Se, por acaso, os dois
// números forem iguais, imprima a mensagem “Números iguais”.

public class Exc3prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        if (numero1 > numero2) {
            System.out.print("O maior número é " + numero1 + ".");
        } else if (numero2 > numero1) {
            System.out.print("O maior número é " + numero2 + ".");
        } else if (numero1 == numero2) {
            System.out.print("Números iguais.");
        } else {
            System.out.print("Tente novamente!");
        }

    }

}
