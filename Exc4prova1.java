import java.util.Scanner;

// 4. Faça um programa que leia o salário de um trabalhador e o valor da prestação de um
// empréstimo. Se a prestação:
//  For maior que 20% do salário, imprima: “Empréstimo não concedido;
//  Caso contrário, imprima: “Empréstimo concedido”

public class Exc4prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = entrada.nextDouble();

        if (prestacao > salario * 0.20) {
            System.out.print("Empréstimo não concedido!");
        } else {
            System.out.print("Empréstimo concedido!");
        }


    }

}
