/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Pagamento;

/**
 *
 * @author csnas
 */
public class PagamentoDAO {
     static String URL = "jdbc:mysql://localhost:3306/teste";
    static String login = "root";
    static String senha = "root";

    public static boolean Salvar(Pagamento obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, login, senha);
             PreparedStatement ComandoSQL = conexao.prepareStatement("INSERT INTO pagamento (cod_venda, subtotal,"
                                + "desconto, juros, valor_final, tipo_pagamento, parcelamento, nome_cliente, cpf_cliente"
                                + ") VALUES (?,?,?,?,?,?,?,?,?)");
                        ComandoSQL.setInt(1, obj.getCodVenda());
                        ComandoSQL.setDouble(2, obj.getSubtotal());
                        ComandoSQL.setDouble(3, obj.getDesconto());
                        ComandoSQL.setDouble(4, obj.getJuros());
                        ComandoSQL.setDouble(5, obj.getValorFinal());
                        ComandoSQL.setString(6, obj.getTipoPagamento());
                        ComandoSQL.setString(7, obj.getParcelamento());
                        ComandoSQL.setString(8, obj.getNomeCliente());
                        ComandoSQL.setString(9, obj.getCpfCliente());

                        int linhasAfetadas = ComandoSQL.executeUpdate();
                        if (linhasAfetadas > 0) {
                            retorno = true;
                        }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return retorno;
    }
}

    

