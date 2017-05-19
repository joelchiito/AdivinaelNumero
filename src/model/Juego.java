/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp245
 */
public class Juego {
    private NumeroSecreto numeroSecreto;
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealizados;
    
    // Constantes simbólicas
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    
    // Método setRangodeNumeroSecreto()
    public void setRangoDelNumeroSecreto(int limiteInferior, int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        numeroSecreto.setRango(this.limiteInferior, this.limiteSuperior);
    }
    
    // Constructor
    public Juego(int limiteInferior, int limiteSuperior, int intentos){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.numeroDeIntentos = intentos;
        this.numeroSecreto = new NumeroSecreto(this.limiteInferior, this.limiteSuperior);
        this.intentosRealizados = 0;
    }
    
    // Método Setter
    public void setNumeroDeIntentos(int intentos){
        this.numeroDeIntentos = intentos;
    }
    
    // Método esElNumeroSecreto()
    public boolean esElNumeroSecreto(int numero){
        this.intentosRealizados++;
        return numeroSecreto.esIgual(numero);
    }
    
    // Método puedeIntentarDeNuevo()
    public boolean puedeIntentarDeNuevo(){
        boolean hayMasOportunidades = this.intentosRestantes() > 0;
        return hayMasOportunidades;
    }
    
    // Método intentosRestantes()
    public int intentosRestantes(){
        int numeroDeIntentosRestantes = this.numeroDeIntentos - this.intentosRealizados;
        return(numeroDeIntentosRestantes);
    }
    
    // Método getTextoDeAyuda()
    public String getTextoDeAyuda(int numero){
        String texto = null;
        if (this.numeroSecreto.esMayor(numero) == true){
            texto = " mayor ";
        }
        else if (this.numeroSecreto.esMenor(numero) == true){
            texto = " menor ";
        }
        return texto;
    }
    
    // Método getNumeroSecreto()
    public int getNumeroSecreto(){
        return this.numeroSecreto.getNumeroSecreto();
    }

}
