public class Contador {
    protected int contagem;

    public Contador(int valor_inicial) {
        this.contagem = valor_inicial;
    }

    public int get_contagem() {
        return this.contagem;
    }

    public void set_contagem(int valor) {
        this.contagem = valor;
    }

    public void incrementar_contagem() {
        this.contagem++;
    }

    public void decrementar_contagem() {
        this.contagem--;
    }
}