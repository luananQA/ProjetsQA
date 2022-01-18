// 1 - Pacote
package devcalc;

// 2 - Biblioteca

// 3 - Classe

import java.util.Scanner;

public class Calc {

    // 3.1 - Atributos
    // Criando e iniciando o objeto "entrada"
    static Scanner entrada = new Scanner(System.in); // entrada = input

    // 3.2 - Métodos e Funções
    // método do main é o principal onde se inicia e chama os demais métodos,
    // por exemplo "passou pelo método somarDoisNumeros".
    public static void main(String[] args) {
        // Exibe o menu da calculadora
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("Escolha o Calculo Desejado");

        // Recebe a opção desejada
        int opcao = entrada.nextInt();
        int num1 =0;
        int num2 =0;

        //Pergunta qual a opção usar para o calculo

        if (opcao >= 1 && opcao <= 4) {
            System.out.print("Entre o 1º numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o 2º numero: ");
            num2 = entrada.nextInt();// Chama a função do calculo desejado
            System.out.print("O resultado é: ");
        }

        switch (opcao) {
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;

            default:
                System.out.println("Opção invalidada");
                break;
        }

    }

    public static int somarDoisNumeros(int num1, int num2) {
        return num1 + num2;


    }


}