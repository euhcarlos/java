import java.util.Scanner;

public class SistemaDeSaqueFor {
    public static void main(String[] args){
        //Cédulas: 100,50, 20, 10, 5, 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DE SAQUE (2 a 1000): ");
        int valorDoSaque = scanner.nextInt();

        if(valorDoSaque < 2 || valorDoSaque > 1000){
            System.out.println("VALOR DE SAQUE INVÁLIDO");
            return;
        }

        int nota = 100;

        for(int i = 0; i < 6; i++){
            int quantidadeDeCedulas = valorDoSaque / nota;
            if(quantidadeDeCedulas > 0){
                System.out.println(quantidadeDeCedulas + " nota(s) de R$"+nota);
                valorDoSaque = valorDoSaque % nota;
            }

            if(nota == 100){
                nota = 50;
            } else if (nota == 50) {
                nota = 20;
            } else if (nota == 20) {
                nota = 10;
            } else if (nota == 10) {
                nota = 5;
            } else if (nota == 5) {
                nota = 2;
            }
        }
    }
}
