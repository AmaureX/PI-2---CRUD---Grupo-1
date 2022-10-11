package model;

// @author cilucena
public class Produto {

    private int idCod;
    private String produto;
    private int quantidade;
    private int pcCompra;
    private int pcVenda;
    private String fornecedor;

    public Produto() {
    }

    public Produto(int pIdCod, String pProduto, int pQuantidade, int pPcCompra, int pPcVenda, String pFornecedor) {

        this.idCod = pIdCod;
        this.produto = pProduto;
        this.quantidade = pQuantidade;
        this.pcCompra = pPcCompra;
        this.pcVenda = pPcVenda;
        this.fornecedor = pFornecedor;
    }

    public int getIdCod() {
        return idCod;
    }

    public void setIdCod(int idCod) {
        this.idCod = idCod;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPcCompra() {
        return pcCompra;
    }

    public void setPcCompra(int pcCompra) {
        this.pcCompra = pcCompra;
    }

    public int getPcVenda() {
        return pcVenda;
    }

    public void setPcVenda(int pcVenda) {
        this.pcVenda = pcVenda;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
