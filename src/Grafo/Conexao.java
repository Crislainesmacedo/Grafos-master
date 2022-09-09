package Grafo;

public class Conexao<E> {

    double valor;
    No<E> no;

    public Conexao(No<E> no) {
        this.no = no;
        valor = 0;
    }

    public Conexao(No<E> no, Double valor) {
        this.no = no;
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        return no.hashCode();
    }

    @Override
    public boolean equals(Object arg0) {
        return arg0.hashCode() == this.hashCode();
    }
}
