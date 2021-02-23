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
public class Dependente extends Associado{
   public static ArrayList<Dependente> listaDep = new ArrayList<>();
   private static int contadorDependente = 0;
   private int codDependente;
   boolean cadEndereco = false;
   boolean situacao = true;
   
    public Dependente() {
        contadorDependente++;
        this.codDependente = contadorDependente;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public ArrayList<Dependente> getListaDep() {
        return listaDep;
    }

    public void setListaDep(ArrayList<Dependente> listaDep) {
        this.listaDep = listaDep;
    }

    public static int getContadorDependente() {
        return contadorDependente;
    }

    public static void setContadorDependente(int contadorDependente) {
        Dependente.contadorDependente = contadorDependente;
    }

    public int getCodDependente() {
        return codDependente;
    }

    public void setCodDependente(int codDependente) {
        this.codDependente = codDependente;
    }

    public boolean isCadEndereco() {
        return cadEndereco;
    }

    public void setCadEndereco(boolean cadEndereco) {
        this.cadEndereco = cadEndereco;
    }
   
    public void cadastrar(String nome, String estado, String cidade, String bairro, String rua,
                int numero, String complemento, String telefone, String cpf, boolean checkbox){
        
        super.cadastrarM(nome, estado, cidade, bairro, rua, numero, complemento, telefone, cpf);
        setCadEndereco(checkbox);
    }
   
}
