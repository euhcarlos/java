package atividade;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        if(n1 > n2){
            System.out.println("O maior número é: " + n1);
        } else if(n1 < n2){
            System.out.println("O maior número é: " + n2);
        } else if (n1 == n2) {
            System.out.println("Os números são iguais!");
        }
    }
}
