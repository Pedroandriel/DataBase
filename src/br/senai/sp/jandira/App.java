package br.senai.sp.jandira;

import br.senai.sp.jandira.Controller.FuncionarioController;
import br.senai.sp.jandira.Controller.Menu;
import br.senai.sp.jandira.Model.Funcionario;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {

        Menu menu = new Menu();
        menu.executarMenu();
        
    }
}
