package model;

// @author cilucena
import java.util.Date;

public class Produto {

    private String idCod;
    private String nome;
    private String quantidade;
    private String pcCompra;
    private String pcVenda;
    private String fornecedor;
    private String marca;
    private String lucro;
    private String secao;
    private Date dataRecebimento;

    public Produto() {
    }

    public String getIdCod() {
        return idCod;
    }

    public void setIdCod(String idCod) {
        this.idCod = idCod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPcCompra() {
        return pcCompra;
    }

    public void setPcCompra(String pcCompra) {
        this.pcCompra = pcCompra;
    }

    public String getPcVenda() {
        return pcVenda;
    }

    public void setPcVenda(String pcVenda) {
        this.pcVenda = pcVenda;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLucro() {
        return lucro;
    }

    public void setLucro(String lucro) {
        this.lucro = lucro;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }
    

}
