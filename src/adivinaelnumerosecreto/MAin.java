/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumerosecreto;
import java.util.Scanner;
import model.Juego;
/**
 *
 * @author hp245
 */
public class MAin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean seAdivinoElNumeroSecreto = false;
        Juego juego = new Juego(1, 100, 5);
        while (juego.puedeIntentarDeNuevo() == true
                && !seAdivinoElNumeroSecreto){
            System.out.print("Adivine el numero secreto:");
            numero = entrada.nextInt();
            seAdivinoElNumeroSecreto = juego.esElNumeroSecreto(numero);
            if(seAdivinoElNumeroSecreto){
                System.out.println("Felicidades. Has adivinado el número secreto.");
            }
            else {
                System.out.println("Fallaste. El número secreto es"
                        + juego.getTextoDeAyuda(numero)
                        + "que el numero proporcionado");
                System.out.println("Intenta de nuevo.");
            }
        }
        System.out.println("El número secreto es " + juego.getNumeroSecreto());
    }
    }
    