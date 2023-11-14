package br.senai.sp.jandira.Controller;

import br.senai.sp.jandira.Model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {



    public void executarMenu () throws SQLException {

        boolean sair = false;

        Scanner scanner = new Scanner(System.in);

        FuncionarioController funcionarioController = new FuncionarioController();


        while (!sair){
            System.out.println("1 - Listar Funcionarios");
            System.out.println("2 - Deletar Funcionario");
            System.out.println("3 - Pesquisar Funcionarios");
            System.out.println("4 - Cadastrar Funcionarios" );
            System.out.println("5 - Sair" );

            System.out.println(" Escolha uma opção:  ");
            int opcaoUsuario =  scanner.nextInt();
            scanner.nextLine();


            switch (opcaoUsuario) {
                case 1:
                    funcionarioController.listarFuncionarios();
                    break;

                case 2:
                    funcionarioController.deletarfuncionario();
                    break;

                case 3:
                    System.out.println("Feature in Development");
                    break;


                case  4:
                    System.out.println("Feature in Development");
                    break;

                case 5:
                    sair = true;
                    break;

                default:
                    System.out.println("Escolha uma opção valida");
            }
        }
    }
}
