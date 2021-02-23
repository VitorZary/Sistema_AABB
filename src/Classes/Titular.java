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
public class Titular extends Associado{
    public static ArrayList<Titular> titular = new ArrayList<>();
    private static int contadorAssociado = 0;
    private int codAssociado;
    
    public ArrayList<Integer> codDependente;
    
    private String grau_associado;
    private boolean quitacao=false;
    private boolean situacao;
    
    public Titular() {
        contadorAssociado++;
        this.codAssociado = contadorAssociado;
    }

    public ArrayList<Integer> getCodDependente() {
        return codDependente;
    }

    public void setCodDependente(ArrayList<Integer> codDependente) {
        this.codDependente = codDependente;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public static int getContadorAssociado() {
        return contadorAssociado;
    }

    public static void setContadorAssociado(int contadorAssociado) {
        Titular.contadorAssociado = contadorAssociado;
    }

    public int getCodAssociado() {
        return codAssociado;
    }

    public void setCodAssociado(int codAssociado) {
        this.codAssociado = codAssociado;
    }
    
    public boolean isQuitacao() {
        return quitacao;
    }

    public void setQuitacao(boolean quitacao) {
        this.quitacao = quitacao;
    }
    
    public String getGrau_associado() {
        return grau_associado;
    }

    public void setGrau_associado(String grau_associado) {
        this.grau_associado = grau_associado;
    }
    
    public void cadastrar(String nome, String estado, String cidade, String bairro, String rua, int numero,
                          String complemento, String telefone, String cpf, ArrayList<Integer> codDependente){
        
        this.codDependente = codDependente;
        setQuitacao(false);
        setSituacao(true);
        super.cadastrarM(nome, estado, cidade, bairro, rua, numero, complemento, telefone, cpf);
    }
    
    
    
}
