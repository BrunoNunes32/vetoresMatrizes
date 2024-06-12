import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // AULA DE VETORES E MATRIZES 01/06 (VETORES)
    // int[] dados = new int[5];
    // dados[2] = 9;
    // dados[3] = 7;
    // dados[0] = 6;
    // System.out.println(dados[3]);

    // AULA DE VETORES E MATRIZES 02/06 (MATRIZES)
    // int[][] dados = new int[3][3];
    // for (int i = 0; i < 3; i++) // CONTROLA AS LINHAS
    // for (int j = 0; j < 3; j++) // CONTROLA AS COLUNAS
    // dados[i][j] = j;
    // for (int i = 0; i < 3; i++) {
    // for (int j = 0; j < 3; j++) {
    // System.out.print(dados[i][j]);
    // }
    // System.out.println();
    // }

    // AULA DE VETORES E MATRIZES 03/06 (UTILIZANDO VETORES)
    // int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1 };
    // int totalPassaros = 0;
    // int passarosPrimeira = 0;
    // int passarosSegunda = 0;
    // for (int i = 0; i < 14; i++) {
    // totalPassaros = totalPassaros + passarosPorDia[i];
    // }
    // for (int i = 0; i < 7; i++) {
    // passarosPrimeira = passarosPrimeira + passarosPorDia[i];
    // }
    // for (int i = 7; i < 14; i++) {
    // passarosSegunda = passarosSegunda + passarosPorDia[i];
    // }
    // System.out.println("Total da primeira semana: " + passarosPrimeira);
    // System.out.println("Total da primeira semana: " + passarosSegunda);
    // System.out.println("Total de passaros: " + totalPassaros);

    // AULA DE VETORES E MATRIZES 04/06 (UTILIZANDO MATRIZES)
    // int[][] matriz = { { 9, 8, 7 }, { 5, 3, 2 }, { 6, 6, 7 } };
    // int[] maiorLinha = new int[3];
    // int[] menorColuna = new int[3];

    // for (int i = 0; i < 3; i++) {
    // maiorLinha[i] = 0;
    // }
    // for (int i = 0; i < 3; i++) {
    // menorColuna[i] = 10;
    // }
    // // MAIOR ELEMENTO NA LINHA 0
    // for (int i = 0; i < 3; i++) {
    // if (matriz[0][i] > maiorLinha[0]) {
    // maiorLinha[0] = matriz[0][i];
    // }
    // }
    // // MAIOR ELEMENTO NA LINHA 1
    // for (int i = 0; i < 3; i++) {
    // if (matriz[1][i] > maiorLinha[1]) {
    // maiorLinha[1] = matriz[1][i];
    // }
    // }
    // // MAIOR ELEMENTO NA LINHA 2
    // for (int i = 0; i < 3; i++) {
    // if (matriz[2][i] > maiorLinha[2]) {
    // maiorLinha[2] = matriz[2][i];
    // }
    // }
    // // MENOR ELEMENTO NA COLUNA 0
    // for (int i = 0; i < 3; i++) {
    // if (matriz[i][0] < menorColuna[0]) {
    // menorColuna[0] = matriz[i][0];
    // }
    // }
    // // MENOR ELEMENTO NA COLUNA 1
    // for (int i = 0; i < 3; i++) {
    // if (matriz[i][1] < menorColuna[1]) {
    // menorColuna[1] = matriz[i][1];
    // }
    // }
    // // MENOR ELEMENTO NA COLUNA 2
    // for (int i = 0; i < 3; i++) {
    // if (matriz[i][2] < menorColuna[2]) {
    // menorColuna[2] = matriz[i][2];
    // }
    // }
    // // BUSCANDO O PONTO DE SELA
    // for (int i = 0; i < 3; i++) {
    // for (int j = 0; j < 3; j++) {
    // if (maiorLinha[i] == menorColuna[j]) {
    // System.out.println("Ponto de sela: " + maiorLinha[i]);
    // }
    // }
    // }

    // AULA DE VETORES E MATRIZES 05/06 (LISTs E ARRAYLISTs)
    ArrayList<String> estados = new ArrayList<>();

    // ADICIONANDO ELEMENTOS NA LISTA
    // estados.add("Espirito Santo");
    // estados.add("Ceará");
    // estados.add("Rio de Janeiro");
    // estados.add("Pernambuco");

    // estados.remove("Ceará");

    // estados.contains("Amazonas");

    // AULA DE VETORES E MATRIZES 06/06 (EXEMPLO PRÁTICO COM ARRAYs)

    // ORDENANDO UM ARRAY
    // int[] valores = {9,8,7,6,5};
    // int aux;
    // int count = 0;
    // while(count<2){
    // aux = valores[count];
    // valores[count] = valores[count+1];
    // valores[count+1] = aux;
    // count += 1;
    // }
    // for(int i=0; i<5; i++){
    // System.out.println(valores[i]);
    // }

    // int[] lista = { 13, 41, 5, 86, 72, 9, 82, 36, 27, 8 };
    // int pares = 0;
    // int maiores = 0;
    // for (int i = 0; i < lista.length; i++) {
    // if (lista[i] % 2 == 0) {
    // pares = pares + 1;
    // }
    // if (lista[i] > 28) {
    // maiores = maiores + 1;
    // }
    // }
    // System.out.println("Pares são: " + pares);
    // System.out.println("Maiores que 28 são:" + maiores);

    // BUSCANDO O MAIOR NUMERO PAR DE ACORDO COM A PRIMEIRA POSIÇÃO DA LISTA
    // int[] lista = {8,1,3,5,16,7,9,41,2,10};
    // int x = lista[0];

    // for(int i=0; i<10;i++)
    // if(lista[i] % 2 == 0)
    // if(lista[i] > x)
    // x = lista[i];
    // System.out.println("Resultado: " + x);

  }

}