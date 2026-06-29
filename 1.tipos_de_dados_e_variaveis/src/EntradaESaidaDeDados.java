import java.util.Scanner;

public class EntradaESaidaDeDados {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in); // Para receber infromações do teclado

        System.out.print("Digite uma idade: ");
        int n = scanner.nextInt(); // Pega a informação e guarda dentro de uma variavel

        n *= 2;

        System.out.println("Inteiro: " + n);

        double nb = scanner.nextDouble(); // Pega a informação e guarda dentro de uma variavel

        nb *= 2;

        System.out.println("Inteiro: " + nb);

        String st = scanner.nextLine();

        scanner.close();
        System.out.println("String: " + st);

    }
}
