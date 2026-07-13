import java.util.Scanner;

public class CalculoDePotenciaDoWhile {
    public static void main(String[] args) {
        //Cáculo de Potência sem math.pow

        Scanner scanner = new Scanner(System.in);

        int base, expoente, resultado = 1;

        do{
            System.out.print("INFORME A BASE (TEM QUE SER MAIOR QUE ZERO): ");
            base = scanner.nextInt();
        } while (base < 0);

        do{
            System.out.print("INFORME A EXPOENTE (TEM QUE SER MAIOR QUE ZERO): ");
            expoente = scanner.nextInt();
        }while (expoente < 0);

        while (expoente >= 1){
            resultado = resultado * base;
            expoente--;
        }

        System.out.println("RESULTADO: " + resultado);
    }
}
