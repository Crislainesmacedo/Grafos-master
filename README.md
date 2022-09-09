# Grafos

## Criando um grafo:

Para criar um __Grafo__, é bem simples:

```Java
 Grafo<Tipo> grafo = new Grafo<>();
```

## Adicionando Nós:

Para adicionar um vértice, aqui chamado por __Nó__, é também muito simples.

```Java
Grafo<Tipo> grafo = new Grafo<>();
No<Tipo> novo = grafo.inserirNo("Novo nó");
```

## Conectando Nós:

Sabendo disso, há 4 tipos de variantes de conexão:

- Unidirecional:
Possui um só caminho.
- Bidirecional: 
Possui caminho de ida e volta (representada internamente por duas conexões).
- Valorada: 
Contém valor dado por um número do tipo *double*.
- Não valorada: 
Não contém valor (representada internamente por valor 0).


Programaticamente:
```Java
Grafo<Tipo> grafo = new Grafo<>();

No<Tipo> A = grafo.inserirNo("A");
No<Tipo> B = grafo.inserirNo("B");

grafo.conectar(A, B);       //Conexão unidirecional não valorada
grafo.conectarEspelho(A, B); //Conexão unidirecional valorada
grafo.conectar(A, B, 1);       //Conexão bidirecional não valorada
grafo.conectarEspelho(A, B, 1); //Conexão bidirecional valorada
```

Note que para conexão deste exemplo foi gerada uma conexão, mesmo já houvendo outras entre os dois nós.

## Documentação completa:
 
#### Classe Grafo:
```Java
Grafo<Tipo> grafo = new Grafo<>();
```
Cria um grafo de um tipo *Tipo*.

```Java
No<Tipo> no = grafo.inserirNo(Tipo valor);
```
Insere um novo nó ao grafo.

```Java
grafo.conectar(No<Tipo> A, No<Tipo> B [, double valor]);
```
Conecta um nó *A* a um nó *B* com um valor opcional.

```Java
grafo.conectarEspelho(No<Tipo> A, No<Tipo> B [, double valor]);
```
O mesmo que o anterior, porém conecta também de *B* a *A*.

```Java
grafo.remover(No<Tipo> A);
```
Remove um nó *A* do grafo.

```Java
int regularidade = grafo.regular();
```
Determina se o grafo é k-regular. Retorna o número de regularidade caso seja, caso contrário retorna -1.

```Java
boolean completo = grafo.completo();
```
Determina se o grafo é completo. Caso positivo retorna *true*, *false* em caso contrário.

```Java
ArrayList<No<Tipo>> lista = grafo.buscaLargura(No<E> A) {
```
Efetua uma busca em largura a partir de um nó *A* retornando um *ArrayList* de nós encontrados.

```Java
boolean conexo = grafo.conexo(No<E> no);
```
Determina se um grafo é conexo a partir de um ponto.

```Java
ArrayList<CaminhoDijkstra> tabela = grafo.dijkstraCompleto();
```
Retorna um *ArrayList* de *CaminhoDijkstra* a partir do primeiro nó inserido.
Um *CaminhoDijkstra* é composto por:
```Java
No<E> no;
No<E> caminho;
double valor;
boolean completo;
```

```Java
ArrayList<No<Tipo>> ordenacao = grafo.ordenacaoTopologica();
```
Retorna um *ArrayList* de nós na ordem de uma ordenação topológica. Ciclos não são adicionados a lista.

```Java
ArrayList<ArrayList<No<E>>> fortementeConexo = grafo.fortementeConexos();
```
Retorna um *ArrayList* de *ArrayList* de nós como componentes de subgrafos fortemente conexos.

```Java
ArrayList<No<Tipo>> articulacoes = grafo.articulacoes();
```
Retorna um *ArrayList* de nós articulações no grafo.

#### Classe No:
```Java
No<Tipo> no = grafo.inserirNo(Tipo valor);
```
Insere um novo nó ao grafo.

```Java
no.setValor(Tipo valor);
```
Altera o valor de um nó.

```Java
Tipo valor = no.getValor();
```
Retorna o valor de um nó.

