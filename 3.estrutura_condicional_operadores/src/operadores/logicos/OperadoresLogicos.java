package operadores.logicos;

public class OperadoresLogicos {
    static void main(String[] args) {
        // Operadores lógicos
        // && (AND -> E), || (OR -> OU), !(NOT -> Negação)

        boolean resultado = true && true; // Os dois tem que ser verdade ou falso
        System.out.println("True && True: " + resultado);
        resultado = true && false;
        System.out.println("True && False: " + resultado);

        resultado = false && false;
        System.out.println("False && False: " + resultado);

        resultado = true || false; // Se uma das ocorrencia forem verdade ou falso
        System.out.println("True || False: " + resultado);

        resultado = false || true;
        System.out.println("False || True: " + resultado);

        resultado = false || false;
        System.out.println("False || False: " + resultado);

        resultado = !false && true;
        System.out.println("False || True: Com ! " + resultado);

        resultado = !true && true;
        System.out.println("True && True: Com ! " + resultado);

        resultado = !false && false;
        System.out.println("False && False: Com ! " + resultado);

        resultado = !false || true;
        System.out.println("False || True: Com ! " + resultado);

        resultado = !true || true;
        System.out.println("True || True: Com ! " + resultado);

        resultado = !false || false;
        System.out.println("False || False: Com ! " + resultado);
    }
}
