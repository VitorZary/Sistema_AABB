/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author TURUGO
 */
public class Configuracao {
    private static float mensalidadeTitular = 50;
    private static float taxaDependente = 0;

    public static float getMensalidadeTitular() {
        return mensalidadeTitular;
    }

    public static void setMensalidadeTitular(float mensalidadeTitular) {
        Configuracao.mensalidadeTitular = mensalidadeTitular;
    }

    public static float getTaxaDependente() {
        return taxaDependente;
    }

    public static void setTaxaDependente(float taxaDependente) {
        Configuracao.taxaDependente = taxaDependente;
    }
    
    
    
}
