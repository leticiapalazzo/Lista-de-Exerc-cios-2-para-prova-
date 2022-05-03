import java.util.Scanner;

// 1. Faça um programa que receba via teclado os dados de um produto. Os dados que
// representam o produto estão listados abaixo:
//  Nome (String);
//  Modelo (String);
//  Tamanho (sendo float);
//  Preço (sendo double);
//  Quantidade (int).

public class Exc1prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o modelo do produto: ");
        String modelo = entrada.nextLine();

        System.out.print("Digite o tamanho do produto: ");
        float tamanho = entrada.nextFloat();

        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = entrada.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        
    }

}
