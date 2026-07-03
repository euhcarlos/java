package operadores.relacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        //Operadores Relacionais
        // == (igual a), != (diferente de), > (maior que), < (menor que), >= (maior ou igual a), <= (menor ou igual)

        int a = 5;
        int b = 6;

        System.out.println("Valor A: " + a);
        System.out.println("Valor B: " + b);

        boolean resultado = a == b;
        System.out.println("'A' igual a 'B': " + resultado);

        resultado = 5 != 6;
        System.out.println("'A' diferente de 'B': " + resultado);

        resultado = a > b;
        System.out.println("'A' maior que 'B': " + resultado);

        resultado = a < b;
        System.out.println("'A' menor que 'B': " + resultado);

        resultado = a >= b;
        System.out.println("'A' maior ou igual a 'B': " + resultado);

        resultado = a <= b;
        System.out.println("'A' menor ou igual a 'B': " + resultado);
    }
}
