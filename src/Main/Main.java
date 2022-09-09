package Main;

import Grafo.Grafo;
import Grafo.No;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        

        
        No<String> A = grafo.inserirNo("A");
        No<String> B = grafo.inserirNo("B");
        No<String> C = grafo.inserirNo("C");
        No<String> D = grafo.inserirNo("D");
        No<String> E = grafo.inserirNo("E");
        
        grafo.conectarEspelho(A, B);
        grafo.conectarEspelho(B, C);
        grafo.conectarEspelho(C, D);
        grafo.conectarEspelho(D, A);
        grafo.conectarEspelho(E, A);
        
        ArrayList<No<String>> nos = grafo.ordenacaoTopologica();
        
        ArrayList<No<String>> cmpn = grafo.articulacoes();
        

        System.out.println("Articulações:");
        for (No<String> no: cmpn) {
            System.out.println(no.getValor());
        }
    }
}
