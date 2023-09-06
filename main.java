import java.util.Scanner;

public class main {
    public static Contador instanciar_contador(int valor_inicial) {
        Contador c = new Contador(valor_inicial);
        return c;
    }

    public static Scanner instanciar_scanner() {
        Scanner retorno = new Scanner(System.in);
        return retorno;
    }

    public static void limpar_buffer_do_scanner(Scanner scanner) {
        scanner.nextLine();
    }

    public static int ler_inteiro(Scanner scanner) {
        int retorno = 0;
        retorno = scanner.nextInt();
        limpar_buffer_do_scanner(scanner);
        return retorno;
    }

    public static void imprimir_mensagem(String mensagem) {
        System.out.printf(mensagem);
    }

    public static void imprimir_mensagem_int(String mensagem, int valor) {
        System.out.printf(mensagem, valor);
    }


    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        imprimir_mensagem("O objeto <Contador> será instanciado.\nDigite o valor inicial da contagem: ");
        int valor_inicial = ler_inteiro(leitor);
        Contador c = instanciar_contador(valor_inicial);
        imprimir_mensagem_int("O objeto <Contador> foi instanciado.\nO valor da variável <contagem> é: %d\n", c.get_contagem());
    }
}