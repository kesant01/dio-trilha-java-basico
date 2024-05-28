import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            try {
                //chamando o método contando a lógica de contagem
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }catch (InputMismatchException e) {
            System.out.println("O parâmetros deve ser números inteiros");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que o parametoDoise lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variavél contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}