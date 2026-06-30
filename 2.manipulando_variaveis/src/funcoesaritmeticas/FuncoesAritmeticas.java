package funcoesaritmeticas;

public class FuncoesAritmeticas {
    public static void main(String [] args){

        int primeiroNumero = 15;
        int segundoNumero = 25;

        System.out.println(primeiroNumero + segundoNumero); // Soma
        System.out.println(primeiroNumero - segundoNumero); // Subtração
        System.out.println(primeiroNumero * segundoNumero); // Multiplicação
        System.out.println(primeiroNumero / segundoNumero); // Divisão

        int resultadoDaSoma = primeiroNumero + segundoNumero;
        System.out.println(resultadoDaSoma);
        int resultadoDaSubtracao = primeiroNumero - segundoNumero;
        System.out.println(resultadoDaSubtracao);
        int resultadoDaMultiplicacao = primeiroNumero * segundoNumero;
        System.out.println(resultadoDaMultiplicacao);
        int resultadoDaDivisao = primeiroNumero / segundoNumero;
        System.out.println(resultadoDaDivisao);

        // Operador "módulo"
        int restoDaDivisao = 10 % 3; //Caso 0 numero par e se 1 numero impar
        System.out.println(restoDaDivisao);

        // Class Math

        double resultado = Math.pow(5.0, 3.0); //Numero elevado
        System.out.println(resultado);

        double resultadoSqrt = Math.sqrt(25.0); //Raiz quadrada
        System.out.println(resultadoSqrt);

        System.out.println("Qual numero é maior: " + Math.max(80,70)); // Retorna maior numero

    }
}
