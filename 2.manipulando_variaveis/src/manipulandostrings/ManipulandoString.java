package manipulandostrings;

public class ManipulandoString {
    public static void main(String [] args) {

        String palavra = "Manipulando String";

        System.out.println(palavra.length());

        System.out.println("Tudo maisculo: " + palavra.toUpperCase());

        System.out.println("Tudo minusculo: " + palavra.toLowerCase());

        System.out.println("Mostrando a parti do decimo caracter: " + palavra.substring(12));

        palavra = palavra.substring(12);

        System.out.println(palavra);

    }
}
