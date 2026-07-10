public class EstruturasRepeticao {
    public static void main(String[] args) {
        forCrescente();
        forDecrescente();
    }

    public static void forCrescente(){
        System.out.println("For Crescente\n");
        for(int n1 = -10; n1 < 100; n1++) {
            if (n1 % 2 == 0){
                System.out.println("O numero: " + n1 + " é par");
            }else{
                System.out.println("O numero: " + n1 + " é ímpar");
            }
        }

        System.out.println();
    }

    public static void forDecrescente(){
        System.out.println("For Decrescente\n");
        for(int n1 = 100; n1 >= 0; n1--) {
            if (n1 % 2 == 0){
                System.out.println("O numero: " + n1 + " é par");
            }else{
                System.out.println("O numero: " + n1 + " é ímpar");
            }
        }
        System.out.println();
    }
}
