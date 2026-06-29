public class Atribuicao {
    public static void main(String [] args) {

        int numero = 100;
        double altura = 1.78;
        String nome = "Carlos Eduardo";
        boolean maiorDeIdade = true;

        System.out.println(maiorDeIdade);
        System.out.println(altura);
        System.out.println(nome);
        System.out.println(numero);

        int numero1 = 6;
        int numero2 = 99;

        numero1 = numero2;
        System.out.println(numero1);
        numero1 = 100;
        System.out.println(numero1);
        numero1 = numero2 + 5;
        System.out.println(numero1);
        numero1 = numero2 * 5;
        System.out.println(numero1);
        numero1 = numero1 + numero2;
        System.out.println(numero1);

        int numero3 = 0, numero4 = 5, numero5 = 10;
        System.out.println("Numero 3" + numero3);
        System.out.println("Numero 4" + numero4);
        System.out.println("Numero 5" + numero5);

        numero3 = numero4 = numero2;
        System.out.println(numero3);

        numero5++; //Incrementa 1 na variavel
        System.out.println(numero5);
        numero5--; //Decrementa 1 na variavel
        System.out.println(numero5);

        numero5 = 4 / 2;
        System.out.println(numero5);

        numero5 = numero4 / 4;
        System.out.println(numero5);

        int a = 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);

        // String
        String texto1 = "Carlos";
        String texto2 = "Jaqueline";
        System.out.println(texto1 + texto2);

        texto1 = texto1 + texto2;

        System.out.println(texto1 + texto2);
    }
}
