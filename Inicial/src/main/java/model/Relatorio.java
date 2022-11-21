package model;

import java.util.Date;

public class Relatorio {

    private Date Data;
    private String Cliente;
    private double Valor;
    private String Produto;
    private int Quantidade;
    private double ValorUnit;
    private double ValorTotal;

    public Relatorio() {

    }

//    public Relatorio(Date Data, String Cliente, double Valor,
//            String Produto, int Quantidade, double ValorUnit, double ValorTotal){
//        this.Data = Data;
//        this.Cliente = Cliente;
//        this.Valor = Valor;
//        this.Produto = Produto;
//        this.Quantidade = Quantidade;
//        this.ValorUnit = ValorUnit;
//        this.ValorTotal = ValorTotal;
//    }
    
    public Relatorio(Date Data, String Cliente, double Valor, double ValorTotal) {
        this.Data = Data;
        this.Cliente = Cliente;
        this.Valor = Valor;
        this.ValorTotal = ValorTotal;
    }

    public Relatorio(String Produto, int Quantidade, double ValorUnit) {
        this.Produto = Produto;
        this.Quantidade = Quantidade;
        this.ValorUnit = ValorUnit;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public double getValorUnit() {
        return ValorUnit;
    }

    public void setValorUnit(double ValorUnit) {
        this.ValorUnit = ValorUnit;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

}
