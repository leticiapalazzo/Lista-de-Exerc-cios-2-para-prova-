import java.util.Scanner;

// 10. Faça um programa que leia três números inteiros positivos e efetue o cálculo de
// uma das seguintes médias de acordo com um valor numérico digitado pelo usuário
// na tabela a seguir.
// *TABELA NO CLASSROOM*

public class Exc10prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = entrada.nextInt();

        System.out.println("Digite um número para escolher a média a ser calculada: ");
        System.out.println("1 - Média Geométrica");
        System.out.println("2 - Média Ponderada");
        System.out.println("3 - Média Aritmética");
        int médiaDesejada = entrada.nextInt();

        switch (médiaDesejada) {
            case 1:
                double geometrica = numero1 * numero2 * numero3;
                System.out.println("O resultado da Média Geométrica é " + geometrica + ".");
                break;
            case 2:
                double ponderada = (numero1 + 2 * numero2 + 3 * numero3) / 6;
                System.out.println("O resultado da Média Ponderada é " + ponderada + ".");
                break;
            case 3:
                double aritmética = (numero1 + numero2 + numero3) / 3;
                System.out.println("O resultado da Média Aritmética é " + aritmética + ".");
        }

    }

}
