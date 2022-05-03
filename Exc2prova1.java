import java.util.Scanner;

// 2. Faça um programa calculadoras com as seguintes operações:
//  Soma
//  Subtrair
//  Multiplicar
//  Dividir

public class Exc2prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite o sinal da operação (+ , - , * ou /): ");
        char operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            double soma = numero1 + numero2;
            System.out.println("Resultado = " + soma);
        } else if (operacao == '-') {
            double subtracao = numero1 - numero2;
            System.out.println("Resultado = " + subtracao);
        } else if (operacao == '*') {
            double multiplicacao = numero1 * numero2;
            System.out.println("Resultado = " + multiplicacao);
        } else if (operacao == '/') {
            if (numero2 == 0) {
                System.out.print("Operação inválida! Não pode-se dividir por 0.");
            } else if (numero2 > 0) {
                double divisao = numero1 / numero2;
                System.out.print("Resultado = " + divisao);
            }
        } else {
            System.out.print("Tente novamente!");
        }



    }


}
