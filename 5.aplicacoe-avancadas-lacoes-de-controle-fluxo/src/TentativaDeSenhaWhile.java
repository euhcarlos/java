import java.util.Scanner;

public class TentativaDeSenhaWhile {
    public static void main(String[] args) {
        //Tentar acerta a senha até acabar o número de tentativas



        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "Java21";
        String senhaDigitada;
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("DIGITE A SENHA: ");
            senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("O senha foi correta!");
                break;
            } else {
                tentativasRestantes--;
                System.out.println("SENHA INCORRETADA!");
            }

        }

        if(tentativasRestantes==0){
            System.out.println("CONTA BLOQUEADA!");
        }
    }
}
