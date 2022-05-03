import java.util.Scanner;

// 6. Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
// peso ideal, utilizando as seguintes fórmulas (em que “h” corresponde à altura):
//  Homens: (72,2*h) - 58
//  Mulheres (62,1*h) - 44,7


public class Exc6prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o seu sexo (sendo 'F' para feminino e 'M' para masculino): ");
        char sexo = entrada.next().charAt(0);

        if(sexo == 'F') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.print("O peso ideal para sua altura e sexo é " + pesoIdeal + ".");
        } else if(sexo == 'M') {
            double pesoIdeal = (72.2 * altura) - 58;
            System.out.print("O peso ideal para sua altura e sexo é " + pesoIdeal + ".");
        } else {
            System.out.print("Tente novamente!!");
        }

    }

}
