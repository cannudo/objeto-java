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

    public static void verificar_opcao(int opcao, Contador contador) {
        switch(opcao) {
            case 1:
                imprimir_mensagem_int("\nO valor da variável <contagem> é: %d\n", contador.get_contagem());
                break;
            case 2:
                contador.incrementar_contagem();
                imprimir_mensagem_int("\nO valor da variável <contagem> foi incrementado.\nAgora, o valor do contador é: %d\n", contador.get_contagem());
                break;
            case 3:
                contador.decrementar_contagem();
                imprimir_mensagem_int("\nO valor da variável <contagem> foi decrementado.\nAgora, valor do contador é: %d\n", contador.get_contagem());
                break;
            case 99:
                imprimir_mensagem("\nPrograma  encerrado.\n");
                System.exit(0);
                break;
            default:
                imprimir_mensagem("\nOpção inválida.\n");
                break;
        }
    }

    public static void loop_menu(Scanner leitor, Contador contador) {
        int opcao;
        while(true) {
            imprimir_mensagem("\nO que deseja fazer a seguir?\n1 - Verificar o valor do contador\n2 - Incrementar o valor do contador\n3 - Decrementar o valor do contador\n99 - Sair\n");
            opcao = ler_inteiro(leitor);
            verificar_opcao(opcao, contador);
        }
    }


    public static void main(String[] args) {
        Scanner leitor = instanciar_scanner();
        imprimir_mensagem("O objeto <Contador> será instanciado.\nDigite o valor inicial da contagem: ");
        int valor_inicial = ler_inteiro(leitor);
        Contador contador = instanciar_contador(valor_inicial);
        imprimir_mensagem_int("\nO objeto <Contador> foi instanciado.\nO valor da variável <contagem> é: %d\n", contador.get_contagem());
        loop_menu(leitor, contador);
    }
}