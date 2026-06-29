public class Main {
    public static void main(String[] args) {
        //Números Inteiros
        byte numero = 5;
        short numero2 = 150;
        int numero3 = 300;
        long numero4 = 40000; //No final do long tem que colocar o L o final

        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);

        //Numeros reais
        float n1 = 8.4f; // Colocar o F no final, se não ele entende como double
        double n2 = 7.6;

        System.out.println(n1);
        System.out.println(n2);

        //Textos
        char letra = 'A'; // So aceita um caracter
        System.out.println(letra);
        String palavra = "Carlos";
        System.out.println(palavra);

        // Boolean
        boolean verdadeiroOuFalos = true;
        System.out.println(verdadeiroOuFalos);
        verdadeiroOuFalos = false;

        System.out.println(verdadeiroOuFalos);
    }
}
