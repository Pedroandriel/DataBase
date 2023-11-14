package br.senai.sp.jandira.Model;

public class Funcionario {
    private  int idFuncionario;
    private  String nome, sobrenome, matricula, departamento_Fk, permissao;


    public String getpermissap() {
        return permissao;
    }

    public void setpermissap(String permissao) {
        this.permissao = permissao;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento_Fk() {
        return departamento_Fk;
    }

    public void setDepartamento_Fk(String departamento_Fk) {
        this.departamento_Fk = departamento_Fk;
    }

}
