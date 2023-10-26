package pt.ulusofona.lp2.deisichess;
public class Tabuleiro {
    int tamanho;
    int[][] quadrado;

    public Tabuleiro() {
    }
    public int getTamanho() {
        return tamanho;
    }

    public int getQuadrado(int linha, int coluna) {
        return quadrado[linha][coluna];
    }

    public void setQuadrado(int linha, int coluna, int valor) {
        quadrado[linha][coluna] = valor;
    }
}

