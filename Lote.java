public class Lote {
    private int quantidade;
    private Produto produto;
    private Date fabricacao;

    public Lote(String produto, int quantidade, Date fabricacao) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.fabricacao = fabricacao;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public Date getFabricacao() {
        return this.fabricacao;
    }
}
