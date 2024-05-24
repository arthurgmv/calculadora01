package calculadora;

import java.util.Scanner;

public class Calculadora {
    static int num1;
    static int num2;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Olá, digite um número");
        num1 = teclado.nextInt();
        System.out.println("Agora digite outro número");
        num2 = teclado.nextInt();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacao = teclado.nextInt();

        switch (operacao) {
            case 1:
                int soma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " é igual a " + soma);
                break;
            case 2:
                int subtracao = num1 - num2;
                System.out.println(num1 + " - " + num2 + " é igual a " + subtracao);
                break;
            case 3:
                int multiplicacao = num1 * num2;
                System.out.println(num1 + " x " + num2 + " é igual a " + multiplicacao);
                break;
            case 4:
                if (num2!= 0) {
                    double divisao = (double) num1 / num2;
                    System.out.println(num1 + " / " + num2 + " é igual a " + divisao);
                } else {
                    System.out.println("Erro Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        teclado.close();
    }
}
