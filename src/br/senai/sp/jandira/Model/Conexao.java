package br.senai.sp.jandira.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String servidor, banco, user, password;

    public Connection conexao;

    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_senai_jandira";
        this.user = "root";
        this.password = "bcd127";
    }

    public boolean connectDrive() {
        try {

            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.password);
            return true;
        } catch (Exception erro) {
            System.out.println(erro);
            return false;
        }
    }

    public Connection getConnection(){
        boolean validaConexao = connectDrive();
        if (validaConexao){
            return conexao;
        }
        return null;
    }



}

