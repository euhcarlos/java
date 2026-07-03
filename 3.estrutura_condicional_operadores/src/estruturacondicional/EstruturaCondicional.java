package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        // if(se), else if (se não), else (outra, outro)

        Scanner scanner = new  Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 12 && idade < 18) {
            System.out.println("É adolescente!");
        } else if(idade > 18) {
            System.out.println("É maior de idade");
        } else if(idade < 12) {
            System.out.println("É criança");
        }

    }
}
