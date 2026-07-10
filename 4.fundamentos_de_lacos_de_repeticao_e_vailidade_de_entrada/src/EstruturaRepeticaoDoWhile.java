import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {

        int decisaoUsuario = 1;
        do {
            System.out.println("DIGITE 1 para calcular e 2 para sair");

            Scanner sc = new Scanner(System.in);

            decisaoUsuario = sc.nextInt();

            if (decisaoUsuario == 1) {
                calculoIMC();
            } else if (decisaoUsuario != 2) {
                decisaoUsuario = 1;
                System.out.println("VOCÊ DIGITOU UMA OPÇÃO INVÁLIDA");
                continue;
            }
        } while (decisaoUsuario == 1);
    }

    public static void calculoIMC() {
        System.out.println("Bem-vindo a calculador de IMC: \n");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("DIGITE SEU PESO: ");
            double peso = sc.nextDouble();

            if (peso <= 0) {
                break;
            }

            System.out.print("DIGITE SEU ALTURA: ");
            double altura = sc.nextDouble();

            if (altura <= 0) {
                break;
            }

            double imc = peso / (altura * altura);

            System.out.println("\nSEU IMC: " + imc);
            System.out.println();
            System.out.println("Abaixo de 18,5: Abaixo do peso\nEntre 18,5 e 24,9: Peso normal (adequado)\nEntre 25,0 e 29,9: Sobrepeso\nEntre 30,0 e 34,9: Obesidade grau I\nEntre 35,0 e 39,9: Obesidade grau II\nA partir de 40,0: Obesidade grau III");
            System.out.println();
            System.out.println("CASO QUEIRA SAIR, BASTA DIGITAR 0 OU UM NUMERO MENOR QUE ISSO EM QUALQUER ETAPA: ");
        }
    }
}
