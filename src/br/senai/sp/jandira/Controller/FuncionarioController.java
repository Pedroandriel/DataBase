package br.senai.sp.jandira.Controller;

import br.senai.sp.jandira.Model.Conexao;
import br.senai.sp.jandira.Model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FuncionarioController {

    Scanner scanner = new Scanner(System.in);

    // para deletar algo do banco de dados
    public boolean deletarfuncionario() throws SQLException{
        System.out.println(" Informe o nome do Funcionario que deseja excluir: ");
        String nomeDelete = scanner.nextLine();

        Conexao conexao = new Conexao();

        Connection connection = conexao.getConnection();

        Statement statement = connection.createStatement();

        String quaryDelete = "DELETE from funcionario WHERE nome = " + nomeDelete + "'";

        try {
            statement.executeUpdate(quaryDelete);
            return true;
        } catch (Exception erro){
            System.out.println(erro);
            return false;
        }
    }

    public  void listarFuncionarios() throws SQLException {
        // A primeira faze para dar inicio ao nosso projeto no sentido de listar os funcionarios  é Intanciar Conexão

        Conexao conexao = new Conexao();

        Connection connection  = conexao.getConnection();

        Statement statement = connection.createStatement();

        String queryConsultar = "SELECT * FROM funcionario";

        ResultSet resultSet = statement.executeQuery(queryConsultar);

        Funcionario funcionario = new Funcionario();

        while (resultSet.next()){
            funcionario.setIdFuncionario(resultSet.getInt("idfuncionario"));
            funcionario.setMatricula(resultSet.getString("matricula"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setSobrenome(resultSet.getString("sobrenome"));
            funcionario.setpermissap(resultSet.getString("permissap"));
            funcionario.setDepartamento_Fk(resultSet.getString("departamento_FK"));


            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome() + "" + funcionario.getSobrenome());
            System.out.println(funcionario.getMatricula());
            System.out.println(funcionario.getpermissap());
            System.out.println(funcionario.getDepartamento_Fk());
            System.out.println("----------------------------------------------------------------");

        }
    }
    public void deletarfuncionarios(){
    }
    public void pesquisarFuncionario(){
    }
}