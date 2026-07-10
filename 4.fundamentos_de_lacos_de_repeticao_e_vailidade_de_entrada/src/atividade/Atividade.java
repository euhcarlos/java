package atividade;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        estruturaFor();
        estrturaWhile();
        estruturaDoWhile();
    }

    private static void estruturaDoWhile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SEU NOME: ");
        String nome = sc.nextLine();

        System.out.print("DIGITE UM NUMERO POSITIVO: ");
        int numero = sc.nextInt();
        int valor = 0;

        System.out.println("\nDO WHILE CRECENTE\n");
        do{
            System.out.println(valor);
            valor++;
        } while (valor <= numero);

        System.out.println("\nWHILE DECRECENTE\n");
        valor = 0;
        int numero2 = numero;
        do{
            System.out.println(numero2);
            numero2--;
        } while (numero2 >= valor);

        System.out.println("MOSTRANDO NOME: ");
        if(nome.length() > 6){
            int n = 0;
            do{
                System.out.println(nome);
                n++;
            } while (numero > n);
        } else {
            System.out.println(nome);
        }
    }

    private static void estrturaWhile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SEU NOME: ");
        String nome = sc.nextLine();

        System.out.print("DIGITE UM NUMERO POSITIVO: ");
        int numero = sc.nextInt();
        int valor = 0;

        System.out.println("\nWHILE CRECENTE\n");
        while (valor <= numero){
            System.out.println(valor);
            valor++;
        }
        System.out.println("\nWHILE DECRECENTE\n");
        valor = 0;
        int numero2 = numero;
        while (numero2 >= valor) {
            System.out.println(numero2);
            numero2--;
        }

        System.out.println("MOSTRANDO NOME: ");
        if(nome.length() > 6){
            int n = 0;
            while (n < numero){
                System.out.println(nome);
                n++;
            }
        } else {
            System.out.println(nome);
        }
    }

    public static void estruturaFor(){
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SEU NOME: ");
        String nome = sc.nextLine();

        System.out.print("DIGITE UM NUMERO POSITIVO: ");
        int numero = sc.nextInt();

        System.out.println("\nFOR CRECENTE\n");
        for(int i = 0; i <= numero; i++){
            System.out.println(i);
        }
        System.out.println("\nFOR DECRECENTE\n");
        for(int i = numero; i >= 0; i--){
            System.out.println(i);
        }

        System.out.println("MOSTRANDO NOME: ");
        if(nome.length()>6){
            for(int i = 0; i <= numero; i++){
                System.out.println(nome);
            }
        }else{
            for(int i = 0; i <= numero; i++){
                System.out.println(nome);
            }
        }
    }
}
