package model;

// @author cilucena
import java.util.Date;

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
    private Date dataRecebimento;

    public Produto() {
    }

  

    public int getIdCod() {
        return idCod;
    }

    public void setIdCod(int idCod) {
        this.idCod = idCod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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

    public void setPcCompra(double pcCompra) {
        this.pcCompra = pcCompra;
    }

    public double getPcVenda() {
        return pcVenda;
    }

    public void setPcVenda(double pcVenda) {
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

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public void setIdCod(int i, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    
        
    

}
