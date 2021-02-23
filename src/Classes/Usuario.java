/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author TURUGO
 */
public class Usuario {
    public static ArrayList<Usuario> usuario = new ArrayList<>();
    private static int contadorUsuario = 0;
    private int codAssociado;
    private String nome;
    private String senha;
    private String login;

    public Usuario() {
        contadorUsuario++;
        this.codAssociado = contadorUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public void cadastrar(String nome, String senha, String login){
        setNome(nome);
        setLogin(login);
        setSenha(senha);
    }
    
}
