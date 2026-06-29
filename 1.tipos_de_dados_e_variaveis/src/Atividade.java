import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo!");

        System.out.print("Digite seu nome completo: ");
        String nome = s.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = s.next();

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = s.nextDouble();

        System.out.print("Digite sua peso: ");
        double peso = s.nextDouble();

        System.out.print("Digite seu estado civil: ");
        String estado = s.next();

        s.close();

        System.out.println("Nome: " + nome + " - " + "CPF: " + cpf + " - " + "Idade: " + idade+ " - " + "Altura: " + altura + " - " + "Peso: " + peso + " - " + "Estado Civil: " + estado);
    }
}
