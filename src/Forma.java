public class Forma {

    private String posicao;
    private int tamanho;
    private Cor cor;


    public Forma (Cor cor, String posicao, int tamanho) {
        this.cor = cor;
        this.posicao = posicao;
        this.tamanho = tamanho;

    }

    @Override
    public String toString() {
        return "Forma > " + "Cor: " + cor.getCor() + " | Posicao: " + posicao + " | Tamanho: " + tamanho;
    }

}
