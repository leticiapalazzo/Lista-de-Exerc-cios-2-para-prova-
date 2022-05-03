import java.util.Scanner;

// 8. Escreva um programa que, dada a idade de um nadador, o classifique em uma das
// seguintes categorias:
// Categoria           Idade
// Infantil A           5-7
// Infantil B           8-10
// Juvenil A            11-13
// Juvenil B            14-17
// Sênior               maiores de 18 anos

public class Exc8prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade >= 5 && idade <= 7) {
            System.out.print("Categoria Infantil A ");
        } else if(idade >= 8 && idade <= 10) {
            System.out.print("Categoria Infantil B ");
        } else if(idade >= 11 && idade <= 13) {
            System.out.print("Categoria Juvenil A ");
        } else if(idade >= 14 && idade <= 17) {
            System.out.print("Categoria Juvenil B ");
        } else {
            System.out.print("Sênior ");
        }
    
    }

}
