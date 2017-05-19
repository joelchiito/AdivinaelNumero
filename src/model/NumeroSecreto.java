/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Random;
/**
 *
 * @author hp245
 */
public class NumeroSecreto {
    private int numero;
    private int limiteInferior;
    private int limiteSuperior;
    private Random generador;
    
    // Constantes simbolicas
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    
    // Método setRango()
    public void setRango(int limiteInderior, int limiteSuperior){
        if (limiteInferior > limiteSuperior) {
            this.limiteInferior = LIM_INF_PREDET;
            this.limiteSuperior = LIM_SUP_PREDET;
        }
        else {
            this.limiteInferior = limiteInferior;
            this.limiteSuperior = limiteSuperior;
        }
    }
    
    // Método generar()
    public final void generar () {
        this.numero = generador.nextInt(limiteSuperior) + 1;
    }
    
    // 1er Constructor
    public NumeroSecreto(int limiteInferior, int limiteSuperior) {
        this.setRango(limiteInferior, limiteSuperior);
        this.generador = new Random();
        this.generar();
    }
    
    // 2do Constructor
    public NumeroSecreto() {
        this(LIM_INF_PREDET, LIM_SUP_PREDET);
    }
    
    // Getters
    public int getNumeroSecreto() {
        return this.numero;
    }
    public int getLimiteInferior() {
        return this.limiteInferior;
    }
    public int getLimiteSuperior() {
        return this.limiteSuperior;
    }
    
    // clase esMayor()
    public boolean esMayor(int numero) {
        boolean elNumeroSecretoEsMayor;
        if (this.numero > numero) {
            elNumeroSecretoEsMayor = true;
        }
        else {
            elNumeroSecretoEsMayor = false;
        }
        return elNumeroSecretoEsMayor;
    }
    
    // clase esMenor()
    public boolean esMenor(int numero) {
        boolean elNumeroSecretoEsMenor = false;
        if (this.numero < numero) {
            elNumeroSecretoEsMenor = true;
        }
        return elNumeroSecretoEsMenor;
    }
    
    // clase esIgual()
    public boolean esIgual(int numero) {
        return (this.numero == numero);

}
}

