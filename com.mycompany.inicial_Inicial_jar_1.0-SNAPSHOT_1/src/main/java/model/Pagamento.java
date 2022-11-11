/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ciluc
 */
public class Pagamento {
    
    private int cpfCliente;
    private String nomeCliente;
    private String tipoPagamento;
    private double desconto;
    private double valorFinal;
    private double subtotal;
    private String parcelamento;
    private String juros;

     public String getTipoPagamento() {
        return tipoPagamento;
    }
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    
    public void setValorFinal(double valorFinal){
        this.valorFinal = valorFinal;
    }

    public String getParcelamento() {
        return parcelamento;
    }
    
    public void setParcelamento(String parcelamento) {
        this.parcelamento = parcelamento;
    }

    public String getJuros() {
        return juros;
    }
    
    public void setJuros(String juros){
        this.juros = juros;
    }  
       
}
