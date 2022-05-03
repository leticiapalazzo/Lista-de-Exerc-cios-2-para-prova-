import java.util.Scanner;

// 9. Faça um programa que leia a altura e o peso de uma pessoa. 
// De acordo com a tabela a seguir, verifique e mostre qual a classificação dessa pessoa.
// *TABELA NO CLASSROOM*

public class Exc9prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        float altura = entrada.nextFloat();

        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();

        if (altura < 1.20 && peso <= 60) {
            String classificacao = "A";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura < 1.20 && peso > 60 && peso <= 90) {
            String classificacao = "D";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura < 1.20 && peso > 90) {
            String classificacao = "G";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura >= 1.20 && altura <= 1.70 && peso <= 60) {
            String classificacao = "B";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura >= 1.20 && altura <= 1.70 && peso > 60 && peso <= 90) {
            String classificacao = "E";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura >= 1.20 && altura <= 1.70 && peso > 90) {
            String classificacao = "H";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura > 1.70 && peso <= 60) {
            String classificacao = "C";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura > 1.70 && peso > 60 && peso <= 90) {
            String classificacao = "F";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else if (altura > 1.70 && peso > 90) {
            String classificacao = "I";
            System.out.print("A classificação dessa pessoa é " + classificacao + ".");
        } else {
            System.out.print("Tente novamente!");
        }


    }

}
