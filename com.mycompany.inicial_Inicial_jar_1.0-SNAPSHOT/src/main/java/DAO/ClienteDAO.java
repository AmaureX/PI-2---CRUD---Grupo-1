/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Leonardo
 */
public class ClienteDAO {

    static String URL = "jdbc:mysql://localhost:3306/teste";
    static String Login = "root";
    static String Senha = "root";//Mude quando voce fazer a porra do pull!

    public static boolean Salvar(Cliente obj) {
        boolean Retorno= false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("INSERT INTO clientes (cpf,nome_cliente,data_nasc,genero,estado_civil,lougradouro,bairro,cep,email,celular) VALUES (?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            ComandoSQL.setString(1, obj.getCPF());
            ComandoSQL.setString(2, obj.getNome());
            ComandoSQL.setDate(3, new java.sql.Date(obj.getDataNascimento().getTime()));
            ComandoSQL.setString(4, obj.getGenero());
            ComandoSQL.setString(5, obj.getEstadoCivil());
            ComandoSQL.setString(6, obj.getEndereco());
            ComandoSQL.setString(7, obj.getBairro());
            ComandoSQL.setString(8, obj.getCEP());
            ComandoSQL.setString(9, obj.getEmail());
            ComandoSQL.setString(10, obj.getCelular());

            int NumeroLinha = ComandoSQL.executeUpdate();
            if(NumeroLinha>0){
                Retorno=true;
            }
            
        } catch (ClassNotFoundException | SQLException erro){
            JOptionPane.showMessageDialog(null,erro.getMessage());
        }
        return Retorno;
    }

}
