import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, result = 0;
        int op;
        char operador = '+';
        System.out.println("Digite um número: ");
        n1 = leitor.nextInt();
        System.out.println("Digite segundo número: ");
        n2 = leitor.nextInt();
        do{
            System.out.println("Digite" +
                    "\n 1 - Soma" +
                    "\n 2 - Subtração" +
                    "\n 3 - Multiplicação" +
                    "\n 4 - Divisão" +
                    "\n 0 - Sair"
            );
            op = leitor.nextInt();
            switch (op){
                case 1:
                    result = n1 + n2;
                    operador = '+';
                    break;
                case 2:
                    result = n1 - n2;
                    operador = '-';
                    break;
                case 3:
                    result = n1 * n2;
                    operador = '*';
                    break;
                case 4:
                    if(n2 != 0){
                        result = n1 / n2;
                        operador = '/';
                    }
                    else {
                        System.out.println("Divisor não deve ser zero");
                        result = 0;
                        operador = '/';
                    }
                    break;
                case 0:
                    System.out.println("Obrigada por utilizar nossa calculadora!");
                    break;
            }
            System.out.println(n1 + " " + operador + " " + n2 +
                    " = " + result );
        }while(op!=0);

    }
}
