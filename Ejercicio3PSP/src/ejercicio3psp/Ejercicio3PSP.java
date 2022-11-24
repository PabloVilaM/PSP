/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Ejercicio3PSP extends Thread {
    static int contado2 = 0;
    public  Ejercicio3PSP(int contador){
        contado2 = contador;
    }
    public void run() {
        if (contado2 < 20){
            System.out.println("Soy el hilo n = " + Ejercicio3PSP.contado2);
            new Ejercicio3PSP(contado2 + 1).start();
        }
     }
    public static void main (String [] args) {
        new Ejercicio3PSP(contado2).start();
        System.out.println("Termina thread main");
     }
}
