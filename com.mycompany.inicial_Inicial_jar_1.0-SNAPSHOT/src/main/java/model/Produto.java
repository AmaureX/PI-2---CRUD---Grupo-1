/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ciluc
 */
package model;

// @author cilucena
public class Produto{

    private int idCod;
    private String nome;
    private int quantidade;
    private double pcCompra;
    private double pcVenda;
    private String fornecedor;
    private String marca;
    private int lucro;
    private String secao;
    private String buscaProduto;
    private int dataRecebimento;
    public Produto() {
    }

    public Produto(int IdCod, String Nome, int Quantidade, int PcCompra, int PcVenda, String Fornecedor, String Marca, int lucro, String secao, String buscaProduto, int dataRecebimento) {

        this.idCod = IdCod;
        this.nome = Nome;
        this.quantidade = Quantidade;
        this.pcCompra = PcCompra;
        this.pcVenda = PcVenda;
        this.fornecedor = Fornecedor;
        this.marca = Marca;
        this.lucro = lucro;
        this.secao = secao;
        this.buscaProduto = buscaProduto;
        this.dataRecebimento = dataRecebimento;
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

    public String getBuscaProduto() {
        return buscaProduto;
    }

    public void setBuscaProduto(String buscaProduto) {
        this.buscaProduto = buscaProduto;
    }

    public int getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(int dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

}