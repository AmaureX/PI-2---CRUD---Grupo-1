/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Catiane;
 */
public class Pagamento {
    
    private String cpfCliente;
    private int codVenda;
    private String nomeCliente;
    private String tipoPagamento;
    private double desconto;
    private double valorFinal;
    private double subtotal;
    private double valorRecebido;
    private String parcelamento;
    private double juros;
    private double troco;
    private Date dataVenda;
     
    
    private ArrayList<Vendas> listaItens = null;

     public String getTipoPagamento() {
        return tipoPagamento;
    }
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
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

    public double getJuros() {
        return juros;
    }
    
    public void setJuros(double juros){
        this.juros = juros;
    }  

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public ArrayList<Vendas> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Vendas> listaItens) {
        this.listaItens = listaItens;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    } 

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }
    
       
}
