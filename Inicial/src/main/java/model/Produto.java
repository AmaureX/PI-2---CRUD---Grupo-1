package model;

// @author cilucena
public class Produto {

    private int idCod;
    private String nome;
    private int quantidade;
    private double pcCompra;
    private double pcVenda;
    private String fornecedor;
    private String marca;
    private int lucro;
    private String secao;
    private double precoTotalVenda;
    private double preçoTotalCompra;
    private double lucroTotal;
    private String buscaProduto;
    private int dataRecebimento;
    public Produto() {
    }

    public Produto(int IdCod, String Nome, int Quantidade, int PcCompra, int PcVenda, String Fornecedor, String Marca, int lucro, String secao, double precoTotalVenda, double precoTotalCompra, double lucroTotal, String buscaProduto, int dataRecebimento) {

        this.idCod = IdCod;
        this.nome = Nome;
        this.quantidade = Quantidade;
        this.pcCompra = PcCompra;
        this.pcVenda = PcVenda;
        this.fornecedor = Fornecedor;
        this.marca = Marca;
        this.lucro = lucro;
        this.secao = secao;
        this.precoTotalVenda = precoTotalVenda;
        this.preçoTotalCompra = precoTotalCompra;
        this.lucroTotal = lucroTotal;
        this.buscaProduto = buscaProduto;
        this.dataRecebimento = dataRecebimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLucro() {
        return lucro;
    }

    public void setLucro(int lucro) {
        this.lucro = lucro;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public double getPrecoTotalVenda() {
        return precoTotalVenda;
    }

    public void setPrecoTotalVenda(double precoTotalVenda) {
        this.precoTotalVenda = precoTotalVenda;
    }

    public double getPreçoTotalCompra() {
        return preçoTotalCompra;
    }

    public void setPreçoTotalCompra(double preçoTotalCompra) {
        this.preçoTotalCompra = preçoTotalCompra;
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    public void setLucroTotal(double lucroTotal) {
        this.lucroTotal = lucroTotal;
    }

    public int getIdCod() {
        return idCod;
    }

    public void setIdCod(int idCod) {
        this.idCod = idCod;
    }

    public String getProduto() {
        return nome;
    }

    public void setProduto(String produto) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPcCompra() {
        return pcCompra;
    }

    public void setPcCompra(int pcCompra) {
        this.pcCompra = pcCompra;
    }

    public double getPcVenda() {
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
