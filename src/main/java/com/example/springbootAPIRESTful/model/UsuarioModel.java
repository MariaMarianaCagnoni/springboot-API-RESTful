package com.example.springbootAPIRESTful.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue
    public  Integer codigo;

    @Column(nullable = false,length = 70)
    public String nome;
    @Column(nullable = false,length = 10)
    public String Login;
    @Column(nullable = false, length = 10)
    public String senha;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}

