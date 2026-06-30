package tiposnaoprimitivos;

public class TiposNaoPrimitivos {
    public static void main(String [] args) {

        // Tipos primitivos: Consome menos memória, mas não possui métodos ou atributos

        int meuPrimeiroNumero = 10;
        int meuSegundoNumero = meuPrimeiroNumero;

        System.out.println(meuPrimeiroNumero);
        System.out.println(meuSegundoNumero);

        meuSegundoNumero = 20;

        System.out.println(meuSegundoNumero);

        // Tipos não primitivos: Transforma o número em um objeto que possui métodos úteis, como .toString()

        Integer primeiroNumero = 30;
        Integer segundoNumero = primeiroNumero; // O java não faz outro espaço de memoria, por ser igual a primeiro numero

        System.out.println(primeiroNumero.compareTo(30)); // Compara se é maior ou igual ou menor 0 se igual, 1 se menor -1 maior
        System.out.println(primeiroNumero.doubleValue()); //Transforma em double

    }
}
