package atividade;

import java.util.Scanner;



public class Atividade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valor = true;

        while (valor == true){
            System.out.println("DESEJA USAR QUAL SISTEMA?:\n 1.TABUADA \n 2.IMPRIMIR FRASE \n 3.EXIT");
            int opcao = scanner.nextInt();

            if(opcao == 1){
                Programa1();
            } else if(opcao == 2){
                Programa2();
            } else if(opcao == 3){
                valor = false;
                scanner.close();
            System.out.println("SISTEMA TERMINADA!");
            }
        }
    }

    private static void Programa2() {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        do {
            System.out.println("Escolha: \n Opcão 1: Continuar.\n Opção 2: Sair.");
            valor = scanner.nextInt();
        } while (valor == 0);

        scanner.nextLine();

        if(valor == 1){
            System.out.print("DIGITE UMA FRASE: ");
            String frase = scanner.nextLine();

            System.out.println(frase);

        } else if(valor == 2){
            System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado\n");
        }
    }
    public static void Programa1(){
        Scanner scanner = new Scanner(System.in);

        int valor = 1;

        System.out.print("DIGITE UM VALOR PARA GERAR A TABUADA: ");
        int numero = scanner.nextInt();

        while (valor <= 10){
            System.out.println(numero + " X " + valor + " = " + (numero * valor));
            valor++;
        }
    }
}
