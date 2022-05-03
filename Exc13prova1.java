import java.util.Scanner;

public class Exc13prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if(numero % 3 == 0 && !(numero % 5 == 0)) {
            System.out.println("O número é divisível por 3 e não por 5.");
        } else if (numero % 5 == 0 && !(numero % 3 == 0)) {
            System.out.println("o número é divisível por 5 e não por 3.");
        } else {
            System.out.println("O número não é divisível 3 ou por 5.");
        }

    }

}
