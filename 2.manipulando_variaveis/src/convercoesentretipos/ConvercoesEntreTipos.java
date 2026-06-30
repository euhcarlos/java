package convercoesentretipos;

public class ConvercoesEntreTipos {
    public static void main(String[] args) {

        int numeroInt = 5;
        double numeroDouble = numeroInt;

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        int outroNumeroInt = (int) numeroInt;
        System.out.println(outroNumeroInt);

        // Quando se converte do menor para o maior e implicito
        // Quando se converte do maior para o menor e explicito (com casting)

        String tipoString = String.valueOf(numeroInt);
        System.out.println(tipoString);

        // Autoboxing: O processo automático de conversão de tipos primitivos em seus equivalentes objetos wrapper em Java, como converter um `int` em um `Integer`.
        // Boxing: A conversão manual de um tipo primitivo para um tipo objeto correspondente em Java, como transformar um `double` em um `Double`.

    }
}
