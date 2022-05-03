import java.util.Scanner;

// 7. Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
// possui uma taxa diferente de imposto sobre o produto. Faça um programa em que o
// usuário entre com o valor e o estado de destino do produto e programa retorne o preço
// final do produto acrescido do imposto do estado em que ele será vendido. Se o estado
// digitado não for válido, mostrará uma mensagem de erro.
//  Estado  MG    SP    RJ    MS
// Imposto  7%    12%   15%   8%

public class Exc7prova1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite o estado de destino do produto (sendo 'MG', 'SP', 'RJ', e 'MS'): ");
        String estado = entrada.next();

        double valorFinal;

        switch (estado) {
            case "MG":
                valorFinal = valor + (valor * 0.07);
                System.out.print("O valor final será de R$ " + valorFinal + ".");
                break;
            case "SP":
                valorFinal = valor + (valor * 0.12);
                System.out.print("O valor final será de R$ " + valorFinal + ".");
                break;
            case "RJ":
                valorFinal = valor + (valor * 0.15);
                System.out.print("O valor final será de R$ " + valorFinal + ".");
                break;
            case "MS":
                valorFinal = valor + (valor * 0.08);
                System.out.print("O valor final será de R$ " + valorFinal + ".");
        }

    }

}
