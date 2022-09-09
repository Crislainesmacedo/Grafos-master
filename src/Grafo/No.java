package Grafo;

import java.util.ArrayList;
import java.util.Collections;

public class No<E> {
    ArrayList<Conexao<E>> entrada;
    ArrayList<Conexao<E>> saida;
    E valor;
    int grauDeEntrada;
    int grauDeSaida;
    boolean visitado;

    public No(E valor) {
        this.entrada =   new ArrayList<>();
        this.saida =     new ArrayList<>();
        this.valor = valor;
        this.grauDeEntrada = 0;
        this.grauDeSaida = 0;
    }

    void conectarA(No<E> no) {
        grauDeSaida++;
        no.grauDeEntrada++;
        saida.add(new Conexao<>(no));
        no.entrada.add(new Conexao<>(this));
    }

    void conectarEspelho(No<E> no) {
        grauDeSaida++;
        no.grauDeEntrada++;
        conectarA(no);
        no.conectarA(this);
    }

    void conectarA(No<E> no, double valor) {
        grauDeSaida++;
        no.grauDeEntrada++;
        saida.add(new Conexao<>(no, valor));
        no.entrada.add(new Conexao<>(this, valor));
    }

    void conectarEspelho(No<E> no, double valor) {
        grauDeSaida++;
        no.grauDeEntrada++;
        conectarA(no, valor);
        no.conectarA(this, valor);
    }
    
    void resetarGrau () {
        grauDeSaida = entrada.size();
        grauDeEntrada = saida.size();
    }

    public void remover(No<E> no) {
        saida.removeAll(Collections.singleton(new Conexao<>(no)));
    }

    public ArrayList<Conexao<E>> getEntrada() {
        return entrada;
    }

    public void setEntrada(ArrayList<Conexao<E>> entrada) {
        this.entrada = entrada;
    }

    public ArrayList<Conexao<E>> getSaida() {
        return saida;
    }

    public void setSaida(ArrayList<Conexao<E>> saida) {
        this.saida = saida;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public int getGrauDeEntrada() {
        return grauDeEntrada;
    }
    
    public int getGrauDeSaida() {
        return grauDeSaida;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

}
