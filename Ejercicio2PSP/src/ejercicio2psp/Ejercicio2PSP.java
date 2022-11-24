/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2psp;

import java.util.logging.Level;
import java.util.logging.Logger;

    public class Ejercicio2PSP extends Thread {
        public Ejercicio2PSP(String str) {
            super(str);
         }
        public void run() {
            for (int i = 0; i < 5 ; i++){
                        System.out.println(i + " " + getName()); 
                try {
                    sleep(5000);
                            } catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio2PSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Termina thread " + getName());
         }
        public static void main (String [] args) {
            new Ejercicio2PSP("Pepe").start();
            new Ejercicio2PSP("Juan").start();
            new Ejercicio2PSP("Sergio").start();
            new Ejercicio2PSP("Adrian").start();
            System.out.println("Termina thread main");
         }
    }
